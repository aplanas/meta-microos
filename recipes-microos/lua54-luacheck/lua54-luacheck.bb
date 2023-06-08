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

RPM_NAME = "lua54-luacheck-1.1.0-1.1.noarch.rpm"
RPM_HASH = "dd7c7b070645c280b02bc172ed6b077255d9416975f7915c129c75e54e3e8c4665a87cdbfd4604c8b377ece1d506d94e3584ff84c704ccdf1d74c8cd19148ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luacheck lua54-luacheck luacheck"
RDEPENDS:${PN} += "/bin/sh /usr/bin/lua5.4 lua54 lua54-argparse lua54-luafilesystem update-alternatives"

inherit rpm
