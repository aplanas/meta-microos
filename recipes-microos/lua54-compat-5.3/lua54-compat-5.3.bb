SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua54-compat-5.3-0.10-9.2.aarch64.rpm"
RPM_HASH = "bac8bc2a715f693336bc8bb858c8d0d16bc934368fcf067464c8518262a718836447cfcda904586d6b4204153e51d2a0af313ea08a6bc84685b07385254543f0"

RPROVIDES:${PN} += "lua-compat-5.3 \
lua54-compat-5.3 \
lua54-compat-5.3(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
lua54 \
lua54-bit32"

inherit rpm
