SUMMARY = "Tool to measure socket and RDMA performance"
DESCRIPTION = "qperf measures bandwidth and latency between two nodes. It can work \
over TCP/IP as well as the RDMA transports."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "qperf-0.4.11-1.10.aarch64.rpm"
RPM_HASH = "324cf52320214cf790f681d2793350ca1fd2dd1582123f82e01013c74f315b22af2d284c0501741e5df0f91af46a30a32632dc8deacec22475c055da00c47853"

RPROVIDES:${PN} += "qperf qperf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit)"

inherit rpm
