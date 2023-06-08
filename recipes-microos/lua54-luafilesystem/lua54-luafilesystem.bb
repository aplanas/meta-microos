SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "lua54-luafilesystem-1.8.0-6.2.aarch64.rpm"
RPM_HASH = "9096fcded9822731bbf80d906c1ea423f9ea0768c7a743350c9283c2ab785d336119986be7b30bdf7e30f531209aa18396a9fc3b62fcaf88668e04dbe761465c"

RPROVIDES:${PN} += "lua-luafilesystem lua54-luafilesystem lua54-luafilesystem(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) lua54"

inherit rpm
