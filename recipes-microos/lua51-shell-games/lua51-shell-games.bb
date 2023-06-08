SUMMARY = "Lua library to help execute shell commands"
DESCRIPTION = "A Lua library to help execute shell commands more easily and safely. \
 \
* Easily execute shell commands, while capturing the command's output and exit \
code. Includes compatibility across versions of Lua, LuaJIT, and OpenResty \
where io.popen may not return exit codes (pre Lua 5.2 behavior). \
* Utilities to quote and escape shell arguments for safer, less error-prone \
execution. \
 \
When executing shell commands, shell-games wraps either os.execute or io.popen \
(depending on whether the output is being captured)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua51-shell-games-1.1.0-2.1.noarch.rpm"
RPM_HASH = "3c53b30b6dd331d4ddac9ffbcbd86fcff7c481d7cc930fd4b8f54e7960396b0fb47743f1b68ea37ac525f5cd6631f7cc6fb8d2f153047b695f1fc7a3df8c34f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-shell-games"
RDEPENDS:${PN} += "lua51"

inherit rpm
