SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "rsocket-42.0-2.3.aarch64.rpm"
RPM_HASH = "52c52448dacf734b29c2527f698fd7a07aa3e779650a1e6a1ccf2fd53364ec78c3375a4181f7de69b17ae8a6369f84b1683bd900e941634858c8731f61a1cd45"

RPROVIDES:${PN} += "librspreload.so()(64bit) rsocket rsocket(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit)"

inherit rpm
