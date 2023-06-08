SUMMARY = "InfiniBand Communication Manager Assistant"
DESCRIPTION = "The ibacm daemon helps reduce the load of managing path record lookups on \
large InfiniBand fabrics by providing a user space implementation of what \
is functionally similar to an ARP cache.  The use of ibacm, when properly \
configured, can reduce the SA packet load of a large IB cluster from O(n^2) \
to O(n).  The ibacm daemon is started and normally runs in the background, \
user applications need not know about this daemon as long as their app \
uses librdmacm to handle connection bring up/tear down.  The librdmacm \
library knows how to talk directly to the ibacm daemon to retrieve data."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "ibacm-42.0-2.3.aarch64.rpm"
RPM_HASH = "f3da262672f36a9760b9b7922043da40553801323748745369b59e18afde09fa2cbe95f9b8efc2328525b6a76a1a5187ee8a291c1c632b67355d1aa50573f2f1"

RPROVIDES:${PN} += "config(ibacm) ibacm ibacm(aarch-64) libibacmp.so()(64bit) libibacmp.so(ACMP_1.0)(64bit) libibacmp1"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.5)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-route-3.so.200()(64bit) libnl-route-3.so.200(libnl_3)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) rdma-core(aarch-64) systemd"

inherit rpm
