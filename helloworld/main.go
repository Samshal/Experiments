package main;

import (
	"fmt"
);

func greetWithName(name, greet_text string) string {
	var return_string string = name + " says, " + greet_text;

	return return_string;
}

func main() {
	var greet_text string = "Hello World!";

	fmt.Println(greet_text);

	fmt.Println(greetWithName("Samuel", greet_text));
}