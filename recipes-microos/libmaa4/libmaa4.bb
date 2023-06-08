SUMMARY = "Library providing many low-level data structures"
DESCRIPTION = "The libmaa library provides many low-level data structures which can \
be used for writing compilers, hash tables, sets, lists, \
debugging support, and memory management. libmaa was originally \
implemented as a foundation for the 'kheperalong' package."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "libmaa4-1.4.7-1.12.aarch64.rpm"
RPM_HASH = "23745702b5feee179b254ff358cd0fdaaaa1609c418386ab8e98f23572f5d56455ac68a4e7d302ad624d92428797308d6593e84b8cebfebc07d49bc448308fa1"

RPROVIDES:${PN} += "libmaa.so.4()(64bit) libmaa4 libmaa4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
