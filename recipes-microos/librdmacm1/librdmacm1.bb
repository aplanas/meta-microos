SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "librdmacm1-42.0-2.3.aarch64.rpm"
RPM_HASH = "bbf2b11af1d007202019a2830e330d0e0e5cff7629f2c018af28e2fb9bd9b75faf03bb7460465571778f49902e246d7c475b028661e9cb0a79b785d48bb9038e"

RPROVIDES:${PN} += "librdmacm librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) librdmacm.so.1(RDMACM_1.1)(64bit) librdmacm.so.1(RDMACM_1.2)(64bit) librdmacm.so.1(RDMACM_1.3)(64bit) librdmacm1 librdmacm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.10)(64bit) libibverbs.so.1(IBVERBS_1.5)(64bit) libibverbs.so.1(IBVERBS_1.9)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) rdma-core"

inherit rpm
