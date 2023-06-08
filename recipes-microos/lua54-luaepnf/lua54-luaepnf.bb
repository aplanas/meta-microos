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

RPM_NAME = "lua54-luaepnf-0.3+git19-2.1.noarch.rpm"
RPM_HASH = "03eade3646d35a9d9bf3f6521f17ab13f2a13a498eed0d92b4f4e2e4095137c575449df86c388f7b84ee968ac7e6577aacd2d51d50d9e66232c13d71b6743fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luaepnf lua54-luaepnf"
RDEPENDS:${PN} += "lua54 lua54-lpeg"

inherit rpm
