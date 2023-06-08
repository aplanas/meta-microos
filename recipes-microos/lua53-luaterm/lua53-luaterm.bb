SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "lua53-luaterm-0.07-8.2.aarch64.rpm"
RPM_HASH = "1a0891f8a9f830b2a0af00695807c386396751d1dd36b81d9dad41fe78d02d0af098057baf6621e60c0566dc633a185b74f26ab686577448997524207aaa892e"

RPROVIDES:${PN} += "lua53-luaterm lua53-luaterm(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) lua53"

inherit rpm
