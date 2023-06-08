SUMMARY = "A C library implementing the Cangjie input method"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
This package provides runtime library for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie2-1.3-1.20.aarch64.rpm"
RPM_HASH = "903d52928d363460321e7db370ff3bad251033d48fdd8e73d1eff2f53ab1cf30a059e38179b581d5ac72003cfc542480ed911b05c3e8446c26f2d8884e9e127a"

RPROVIDES:${PN} += "libcangjie.so.2()(64bit) libcangjie2 libcangjie2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
