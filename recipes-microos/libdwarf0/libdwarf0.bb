SUMMARY = "Library to access DWARF information in object files"
DESCRIPTION = "Library of functions to provide creation of DWARF debugging \
information records, DWARF line number information, DWARF address \
range and pubnames information, weak names information, and DWARF \
frame description information."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libdwarf0-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "7e8b72f9dfed0c91809c76d509c7ee8fec5e2bf9f6260f7176ced74c528ac8e0373eaf9f1384bd14845d9be92a6b2eb65a5c5f86bc9a2d26d2b659ae8d18b38e"

RPROVIDES:${PN} += "libdwarf.so.0()(64bit) \
libdwarf0 \
libdwarf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
