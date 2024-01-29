package main

import (
	"fmt"
	"sort"
	"strings"
)

// AlphabetSoup takes the str string parameter and returns the string with the letters in alphabetical order
func AlphabetSoup(str string) string {
	letters := strings.Split(str, "")
	sort.Strings(letters)
	return strings.Join(letters, "")
}

func main() {
	result1 := AlphabetSoup("leftfield")
	fmt.Println(result1)
	result2 := AlphabetSoup("underworld")
	fmt.Println(result2)
}
