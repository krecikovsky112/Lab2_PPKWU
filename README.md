<h1>String API</h1>

API for obtaining information about the passed string.
We receive information about the number of characters (lowercase letters, uppercase letters, spaces, numbers, special characters, contain text in other text).
<h2>Syntax</h2>

-number of uppercase letters

localhost:8080/string_analyzer/upper_case/{ string to analyze }


-number of lowercase letters

localhost:8080/string_analyzer/lower_case/{ string to analyze }


-number of white spaces

localhost:8080/string_analyzer/white_spaces/{ string to analyze }


-number of numbers

localhost:8080/string_analyzer/numbers/{ string to analyze }


-number of special characters

localhost:8080/string_analyzer/special_characters/{ string to analyze }


-number of letters

localhost:8080/string_analyzer/letters/{ string to analyze }

-check if text contain other text

localhost:8080/string_analyzer/is_contain/{ text to contain }/{ text that should contain other text }

<h2>Example</h2>

GET request:

localhost:8080/string_analyzer/spaces/hello world

Answer:

1

GET request:

localhost:8080/string_analyzer/is_contain/hel/hello

Answer:

true