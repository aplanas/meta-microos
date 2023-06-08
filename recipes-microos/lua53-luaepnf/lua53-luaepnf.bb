SUMMARY = "Extended PEG Notation Format (easy grammars for LPeg)"
DESCRIPTION = "The LPeg library is a powerful tool to parse text and extract parts of \
it using captures. It even provides grammars, which can be used to \
parse non-regular languages, but the complexer the language gets, the \
more difficult error handling and keeping track of captured information \
becomes. luaepnf enhances usage of LPeg grammars by building an abstract \
syntax tree (AST) for the input and providing tools for error reporting, \
as well as offering syntax sugar and shortcuts for accessing LPeg's features."
LICENSE = "MIT"

PV = "0.3+git19"

RPM_NAME = "lua53-luaepnf-0.3+git19-2.1.noarch.rpm"
RPM_HASH = "98657c98cd905b26659e87a6612f7dd35286b2b8c25c88b9fe732e3046850d438482a1fd4721cf8a4706a81d6f6706ba1c28146c2a62945991b377472bf3e9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luaepnf"
RDEPENDS:${PN} += "lua53 lua53-lpeg"

inherit rpm
