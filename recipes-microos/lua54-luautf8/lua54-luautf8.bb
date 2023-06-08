SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "lua54-luautf8-0.1.5-2.4.aarch64.rpm"
RPM_HASH = "a6ce3cd0fb43d9cb76bbc6d5a71ad5e32b9072f61dab8e778a2bedfaef634fe7f006d972e03801d468c61ebf0bb0830eb8b580ee6be5f28128f6b5aa50615f6b"

RPROVIDES:${PN} += "lua-luautf8 lua54-luautf8 lua54-luautf8(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) lua54"

inherit rpm
