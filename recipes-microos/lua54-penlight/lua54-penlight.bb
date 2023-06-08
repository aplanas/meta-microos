SUMMARY = "Generally useful modules inspired by the Python standard libraries"
DESCRIPTION = "A set of pure Lua libraries focusing on input data handling (such as \
reading configuration files), functional programming (such as map, \
reduce, placeholder expressions,etc), and OS path management. Much of \
the functionality is inspired by the Python standard libraries."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "lua54-penlight-1.13.1-2.2.noarch.rpm"
RPM_HASH = "d78e9e3cad32895319de3bc901c9611503746a6d72f905485eceadb40489792ec142696f039edc7d2090d72458d0bbd2781e433d27d092e11aae3280e72146c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-penlight lua54-penlight"
RDEPENDS:${PN} += "lua54 lua54-luafilesystem"

inherit rpm
