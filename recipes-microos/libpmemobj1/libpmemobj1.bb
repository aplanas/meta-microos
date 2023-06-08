SUMMARY = "Persistent Memory Transactional Object Store library"
DESCRIPTION = "The libpmemobj library provides a transactional object store, \
providing memory allocation, transactions, and general facilities for \
persistent memory programming."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemobj1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "896558d13f7e1ac7eab6217922edd280871b4194e9dd06d95ce06eed4474d6c2a977c11e6cb62ba4918e21116843288b521d80268610a389c672e990f36b67b2"

RPROVIDES:${PN} += "libpmemobj.so.1()(64bit) libpmemobj.so.1(LIBPMEMOBJ_1.0)(64bit) libpmemobj1 libpmemobj1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdaxctl.so.1()(64bit) libdaxctl.so.1(LIBDAXCTL_2)(64bit) libndctl.so.6()(64bit) libndctl.so.6(LIBNDCTL_1)(64bit) libndctl.so.6(LIBNDCTL_15)(64bit) libndctl.so.6(LIBNDCTL_18)(64bit) libndctl.so.6(LIBNDCTL_3)(64bit) libpmem.so.1()(64bit) libpmem.so.1(LIBPMEM_1.0)(64bit)"

inherit rpm
