SUMMARY = "Persistent Memory Resident Block library"
DESCRIPTION = "libpmemblk implements a pmem-resident array of blocks, all the same \
size, where a block is updated atomically with respect to power \
failure or program interruption (no torn blocks)."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemblk1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "95e01d78fe47b49b03074ccb3a81d163c33ad3312c79af3b8fe6f7c91c74f6cfd910f16488561c0a947e1dfafccd9bf8d5b9775fe561f4eaa164daf4d75cbd24"

RPROVIDES:${PN} += "libpmemblk.so.1()(64bit) libpmemblk.so.1(LIBPMEMBLK_1.0)(64bit) libpmemblk1 libpmemblk1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdaxctl.so.1()(64bit) libdaxctl.so.1(LIBDAXCTL_2)(64bit) libndctl.so.6()(64bit) libndctl.so.6(LIBNDCTL_1)(64bit) libndctl.so.6(LIBNDCTL_15)(64bit) libndctl.so.6(LIBNDCTL_18)(64bit) libndctl.so.6(LIBNDCTL_3)(64bit) libpmem.so.1()(64bit) libpmem.so.1(LIBPMEM_1.0)(64bit)"

inherit rpm
