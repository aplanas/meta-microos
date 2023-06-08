SUMMARY = "Command-line tool for linting and static analysis of Lua code"
DESCRIPTION = "Luacheck is a static analyzer and a linter for Lua. Luacheck detects \
various issues such as usage of undefined global variables, unused variables \
and values, accessing uninitialized variables, unreachable code and more. \
Most aspects of checking are configurable: there are options for defining \
custom project-related globals, for selecting set of standard globals \
(version of Lua standard library), for filtering warnings by type and name of \
related variable, etc. \
The options can be used on the command line, put into a config or directly into \
checked files as Lua comments."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua51-luacheck-1.1.0-1.1.noarch.rpm"
RPM_HASH = "70eb0a88f07ab7ae42892ed68b7757536c059c33ef035090d502a860f04e87b79613bd1f9b17f2000bfe1df4828c7eb7624386257fe3ddca198d406d8981554f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-luacheck luacheck"
RDEPENDS:${PN} += "/bin/sh /usr/bin/lua5.1 lua51 lua51-argparse lua51-luafilesystem update-alternatives"

inherit rpm
