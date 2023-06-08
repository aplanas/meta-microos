SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libibumad3-42.0-2.3.aarch64.rpm"
RPM_HASH = "5fad74c085997048bfb3384c27c8c214f151820b904131f9845dfbf9f53d686aec45d965fbe7162fdb6afac851740c52988609e131156646fe4d24dbbe957f73"

RPROVIDES:${PN} += "libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit) libibumad.so.3(IBUMAD_1.1)(64bit) libibumad.so.3(IBUMAD_1.2)(64bit) libibumad3 libibumad3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
