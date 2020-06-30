package main

import "fmt"

func simpleArraySum(ar []int32) int32 {
	var sum int32 = 0
	for _, num := range ar {
		sum += num
	}
	return sum
}

func main() {
	ar := []int32{1, 2, 3, 4, 10, 11}
	fmt.Println(simpleArraySum(ar))
}
