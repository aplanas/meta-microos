SUMMARY = "LUA bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "lua-Hamliblua-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "9ebdb8d734f5ae8037e8b530b7e95e816ebc2321b7532621725a6c490bcd52ebd7380be9e4809f6ca92bed02135da91d9deb77e3ea6912186c8d741896d70627"

RPROVIDES:${PN} += "lua-Hamliblua lua-Hamliblua(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhamlib.so.4()(64bit)"

inherit rpm
