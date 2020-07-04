package main

import "fmt"

func aVeryBigSum(ar []int64) int64 {
	var sum int64
	for _, value := range ar {
		sum += value
	}
	return sum
}

func main() {
	a := []int64{1000000001, 1000000002, 1000000003, 1000000004, 1000000005}
	fmt.Println(aVeryBigSum(a))
}
