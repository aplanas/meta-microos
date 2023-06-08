SUMMARY = "GlusterFS Remote Procedure Call library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfrpc0-11.0-1.3.aarch64.rpm"
RPM_HASH = "eec034541d5933c33ca8f28b2f5a1832f5878f183a76a30c90a81fb37a78d73f2962b7004c06a2e63db3b8479afdb721331659e2ce4b0c2f62351fbd7de8de83"

RPROVIDES:${PN} += "libgfrpc.so.0()(64bit) libgfrpc0 libgfrpc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfxdr.so.0()(64bit) libglusterfs.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libtirpc.so.3(TIRPC_0.3.3)(64bit)"

inherit rpm
