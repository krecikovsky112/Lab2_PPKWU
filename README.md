<h1>String API</h1>

API for obtaining information about the passed string.
We receive information about the number of characters (lowercase letters, uppercase letters, spaces, numbers, special characters).
<h2>Syntax</h2>

-number of uppercase letters

localhost:8080/string_analyzer/upper_case/{ string to analyze }


-number of lowercase letters

localhost:8080/string_analyzer/lower_case/{ string to analyze }


-number of spaces

localhost:8080/string_analyzer/spaces/{ string to analyze }


-number of numbers

localhost:8080/string_analyzer/numbers/{ string to analyze }


-number of special characters

localhost:8080/string_analyzer/special_characters/{ string to analyze }

<h2>Example</h2>

localhost:8080/string_analyzer/spaces/hello%world

Answer:

1