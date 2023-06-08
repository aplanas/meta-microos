SUMMARY = "LUA bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "lua-Hamliblua-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "fc7a71fd873609606124e2e739a5f6f706b7ff772a68d4fd06034d7ee0e871bcc10bcf2e15299a03469884cdda3db19d17a3632f0cee68ca0b4dd20b2391cc23"

RPROVIDES:${PN} += "lua-Hamliblua lua-Hamliblua(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhamlib.so.4()(64bit)"

inherit rpm
