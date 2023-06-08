SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.21"

RPM_NAME = "lua53-luasystem-0.21-5.2.aarch64.rpm"
RPM_HASH = "b151d861f816b87b3967b184fbbc8172d62f1128e2c74adda511e4847fb4b4e7c9ccb8a95e841cd6414aa1bb9920de6b53ac067140a573c5445e12ea255facf0"

RPROVIDES:${PN} += "lua53-luasystem lua53-luasystem(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) lua53"

inherit rpm
