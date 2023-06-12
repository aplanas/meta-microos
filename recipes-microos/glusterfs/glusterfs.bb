SUMMARY = "Aggregating distributed file system"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. It aggregates various storage bricks over Infiniband RDMA \
or TCP/IP interconnect into one large parallel network file system. \
GlusterFS is one of the most sophisticated file systems in terms of \
features and extensibility. It borrows a powerful concept called \
Translators from GNU Hurd kernel. Much of the code in GlusterFS is in \
user space and easily manageable."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "glusterfs-11.0-2.1.aarch64.rpm"
RPM_HASH = "ee408f343f0509a4a46f6502a562ef43acdfb695044dbeba17d0978de1322a07a4b4c5f6b74a37a5300df82074bf865300cd61bb9688ed81cf07248d42d0fd0e"

RPROVIDES:${PN} += "config(glusterfs) glusterfs glusterfs(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgfapi.so.0()(64bit) libgfapi.so.0(GFAPI_3.4.0)(64bit) libgfapi.so.0(GFAPI_3.4.2)(64bit) libgfapi.so.0(GFAPI_3.5.1)(64bit) libgfapi.so.0(GFAPI_3.6.0)(64bit) libgfapi.so.0(GFAPI_3.7.0)(64bit) libgfapi.so.0(GFAPI_3.7.4)(64bit) libgfapi.so.0(GFAPI_6.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_3.4.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_3.7.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_6.0)(64bit) libgfapi.so.0(GFAPI_PRIVATE_6.1)(64bit) libgfapi0 libgfchangelog.so.0()(64bit) libgfchangelog0 libgfrpc.so.0()(64bit) libgfrpc0 libgfxdr.so.0()(64bit) libgfxdr0 libglusterfs.so.0()(64bit) libglusterfs0 libreadline.so.8()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libtirpc.so.3(TIRPC_0.3.3)(64bit) liburcu-bp.so.8()(64bit) liburing.so.2()(64bit) liburing.so.2(LIBURING_2.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libz.so.1()(64bit)"

inherit rpm
