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

RPM_NAME = "lua53-luacheck-1.1.0-1.1.noarch.rpm"
RPM_HASH = "d9104d6f982cdf049c2f0c0119e2d5cd523288130b21c8ca8b74af9f2dacff5c9616e6db89a7eebaa20900cb3e14bed4ee49c601e937ee9497cf874afa326d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luacheck \
luacheck"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.3 \
lua53 \
lua53-argparse \
lua53-luafilesystem \
update-alternatives"

inherit rpm
