SUMMARY = "User-space RDMA fabric interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "libfabric1-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "d506948b99ad39b29ee0a4f231ec17c1586013648301a5cb9ee4fae8eb58b2703909d96bd268782120f1e90f0aaffdf1565c10c7f39c21ec509f73af0852e4be"

RPROVIDES:${PN} += "libfabric.so.1()(64bit) libfabric.so.1(FABRIC_1.0)(64bit) libfabric.so.1(FABRIC_1.1)(64bit) libfabric.so.1(FABRIC_1.2)(64bit) libfabric.so.1(FABRIC_1.3)(64bit) libfabric.so.1(FABRIC_1.4)(64bit) libfabric.so.1(FABRIC_1.5)(64bit) libfabric.so.1(FABRIC_1.6)(64bit) libfabric1 libfabric1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatomic.so.1()(64bit) libatomic.so.1(LIBATOMIC_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libefa.so.1()(64bit) libefa.so.1(EFA_1.1)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.13)(64bit) libibverbs.so.1(IBVERBS_1.6)(64bit) libibverbs.so.1(IBVERBS_1.8)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) librdmacm.so.1(RDMACM_1.2)(64bit)"

inherit rpm
