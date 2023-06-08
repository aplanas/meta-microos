SUMMARY = "Library to access DWARF information in object files"
DESCRIPTION = "Library of functions to provide creation of DWARF debugging \
information records, DWARF line number information, DWARF address \
range and pubnames information, weak names information, and DWARF \
frame description information."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libdwarf0-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "1c52d88782486272ece9f1b8390e597d017a45d09c2250a7d743031b9d146b3062c527af6d9937dc93fa34ef8590cc4ce3a93ad9047fb48bc9a1dd9495899ca8"

RPROVIDES:${PN} += "libdwarf.so.0()(64bit) libdwarf0 libdwarf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
