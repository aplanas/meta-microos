SUMMARY = "Library for password quality checking and generating random passwords"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality1-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "dbf8c0b46a3a59344cbe0c69dbb8ae2c74e3b4b33928ec1ae4f6e218bc11db9d3bc9e6c3bcd13b08b6816dc8400ade5366fd3b35bf93496575b5ab9d7c583fa1"

RPROVIDES:${PN} += "config(libpwquality1) libpwquality libpwquality.so.1()(64bit) libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) libpwquality1 libpwquality1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig cracklib-dict ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrack.so.2()(64bit)"

inherit rpm
