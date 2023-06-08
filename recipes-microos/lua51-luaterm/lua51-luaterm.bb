SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "lua51-luaterm-0.07-8.2.aarch64.rpm"
RPM_HASH = "f324b7f41bc9d2521f9116df732babf7069cd26e01aaa168f47a862fbd62e78526942fa55845deb6dce857b2fac17822003da0cae7831f8a1fee3e184db52482"

RPROVIDES:${PN} += "lua51-luaterm lua51-luaterm(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) lua51"

inherit rpm
