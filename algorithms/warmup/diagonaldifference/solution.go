package main

import (
	"fmt"
	"math"
)

func diagonalDifference(arr [][]int32) int32 {
	var leftDiagSum int32 = 0
	var rightDiagSum int32 = 0
	for i := 0; i < len(arr); i++ {
		for j := 0; j < len(arr); j++ {
			if i == j {
				leftDiagSum += arr[i][j]
			}

		}
		for j := len(arr) - 1; j >= 0; j-- {
			if (i + j) == (len(arr) - 1) {
				rightDiagSum += arr[i][j]
			}
		}
	}
	answer := math.Abs(float64(rightDiagSum) - float64(leftDiagSum))
	return int32(answer)
}

func main() {
	a := [][]int32{{11, 2, 4}, {4, 5, 6}, {10, 8, -12}}
	fmt.Println(diagonalDifference(a))
}
