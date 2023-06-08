SUMMARY = "GlusterFS volume changelog translator library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
The goal of this volume translator is to capture changes performed on \
a GlusterFS volume. The translator needs to be loaded on the server \
(bricks) and captures changes in a plain text file inside a \
configured directory path (controlled by the 'changelog-dir' \
directive)."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfchangelog0-11.0-1.3.aarch64.rpm"
RPM_HASH = "2b952549c231f05d3a8e7affb3fbc26afe8d22fd48a9f1e3ba2c1d54274917658bb3f96daeaaec92cd05fc305065563b7f4984102b9927b034e045083018f29a"

RPROVIDES:${PN} += "libgfchangelog.so.0()(64bit) libgfchangelog0 libgfchangelog0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfrpc.so.0()(64bit) libgfxdr.so.0()(64bit) libglusterfs.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.3)(64bit)"

inherit rpm
