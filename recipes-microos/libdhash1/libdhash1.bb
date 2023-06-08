SUMMARY = "Dynamic hash table library"
DESCRIPTION = "A hash table which will dynamically resize to achieve optimal storage & access \
time properties"
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libdhash1-0.5.0-27.18.aarch64.rpm"
RPM_HASH = "afb718a556138b898ba265c487220b7295cf7a3ab6d72625e349aeb430d9844fe3e2a9eefd28f5a901c8e1bf9b9df8c4f711994aff95f967c4b04d0dc4893fb4"

RPROVIDES:${PN} += "libdhash.so.1()(64bit) libdhash.so.1(DHASH_0.4.3)(64bit) libdhash1 libdhash1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
