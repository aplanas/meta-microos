SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "lua53-penlight-1.13.1-2.2.noarch.rpm"
RPM_HASH = "980353eef3c768cf8f6fb49ebaaa162bad113d9b9a3e98af21ea1e7266eb219e422c89180ce34b45e555e045dadcc6cbdfcd03e69a39443b99446df1b8d75cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-penlight"
RDEPENDS:${PN} += "lua53 lua53-luafilesystem"

inherit rpm
