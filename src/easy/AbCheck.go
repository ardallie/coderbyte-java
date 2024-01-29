package main

import (
	"fmt"
	"regexp"
)

// ABCheck takes the str parameter and returns true if the characters a and b are separated by exactly 3 places anywhere in the string at least once
func ABCheck(str string) string {
	re := regexp.MustCompile(`(a...b|b...a)`)
	return fmt.Sprintf("%t", re.MatchString(str))
}

func main() {
	result1 := ABCheck("lane borrowed")
	fmt.Println(result1)
	result2 := ABCheck("australia")
	fmt.Println(result2)
}
