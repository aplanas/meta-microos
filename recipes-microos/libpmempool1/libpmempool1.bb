SUMMARY = "Persistent Memory pool management library"
DESCRIPTION = "The libpmempool library provides a set of utilities for off-line administration, \
analysis, diagnostics and repair of persistent memory pools created \
by libpmemlog, libpemblk and libpmemobj libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmempool1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "55adaa4d8e3c8ae24a9398c919dafd37acf904b4ad9f5eff500bf6cfa05a0014cd8f9e3535b3c8fa1ee2d15f1f0115bd8c98d32651271b88dd8f753c74e2e638"

RPROVIDES:${PN} += "libpmempool.so.1()(64bit) libpmempool.so.1(LIBPMEMPOOL_1.0)(64bit) libpmempool1 libpmempool1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdaxctl.so.1()(64bit) libdaxctl.so.1(LIBDAXCTL_2)(64bit) libndctl.so.6()(64bit) libndctl.so.6(LIBNDCTL_1)(64bit) libndctl.so.6(LIBNDCTL_15)(64bit) libndctl.so.6(LIBNDCTL_18)(64bit) libndctl.so.6(LIBNDCTL_3)(64bit) libpmem.so.1()(64bit) libpmem.so.1(LIBPMEM_1.0)(64bit)"

inherit rpm
