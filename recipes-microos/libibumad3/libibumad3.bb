SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibumad3-45.0-1.1.aarch64.rpm"
RPM_HASH = "90d1e5f43d2afc7f6c5221d05f96f7cfb75d5b371f0b5ec205fce6e49276b0d245104a00cb65b45a1f17b373fcf8a743a80b89690b1f5cbf49d8105a215e9a31"

RPROVIDES:${PN} += "libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit) libibumad.so.3(IBUMAD_1.1)(64bit) libibumad.so.3(IBUMAD_1.2)(64bit) libibumad3 libibumad3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
