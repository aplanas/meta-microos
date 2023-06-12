SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "lua53-lpeg-1.0.2-6.3.aarch64.rpm"
RPM_HASH = "cba9143a0e43c96c3d1c208d041846efa033937fbff131daf8957226f838032ed87264bb0bc91d8bab8fc39f7cceae8cc3b83701c36fae4889d00158a4aff83d"

RPROVIDES:${PN} += "lua53-LPeg \
lua53-lpeg \
lua53-lpeg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lua53"

inherit rpm
