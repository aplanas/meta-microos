SUMMARY = "MDB Tools ODBC driver for unixODBC"
DESCRIPTION = "Contains shared library libmdb3 from mdbtools"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libmdb3-1.0.0-1.7.aarch64.rpm"
RPM_HASH = "bfdb227cd85fec8c9bf26c083e1f604f159244a2d1f8b27bf330c5c1198b29738810f3224ddbd6e03ec8e7ed0a5da64d8fd4186d16ecdc1f28e6dc86b3af5902"

RPROVIDES:${PN} += "libmdb.so.3()(64bit) libmdb3 libmdb3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
