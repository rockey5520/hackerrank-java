package main

import "fmt"

func compareTriplets(a []int32, b []int32) []int32 {

	scores := []int32{0, 0}
	var aliceScore int32 = 0
	var bobScore int32 = 0
	for i := 0; i < len(a); i++ {
		if a[i] > b[i] {
			aliceScore++
		} else if a[i] < b[i] {
			bobScore++
		}
	}
	scores[0] = aliceScore
	scores[1] = bobScore
	return scores
}

func main() {
	a := []int32{17, 28, 30}
	b := []int32{99, 16, 8}
	fmt.Println(compareTriplets(a, b))
}
