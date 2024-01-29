package main

import (
	"fmt"
	"strconv"
)

// AdditivePersistence calculates the additive persistence of a positive integer
func AdditivePersistence(num int) int {
	times := 0
	added := num
	for added > 9 {
		sum := 0
		digits := strconv.Itoa(added)
		for _, digit := range digits {
			digitInt, _ := strconv.Atoi(string(digit))
			sum += digitInt
		}
		added = sum
		times++
	}
	return times
}

func main() {
	result1 := AdditivePersistence(199)
	fmt.Println(result1)
	result2 := AdditivePersistence(913)
	fmt.Println(result2)
}
