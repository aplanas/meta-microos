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

RPM_NAME = "libgfchangelog0-11.0-2.1.aarch64.rpm"
RPM_HASH = "3a1d32ccc2ef17729a5807a3f2b58274ade5d614fbec4a6cf80d58e2c138de911fd932026a876f069c4d519a6ad05af2401eecfa58ce5de7929a8d4a27f43f59"

RPROVIDES:${PN} += "libgfchangelog.so.0()(64bit) \
libgfchangelog0 \
libgfchangelog0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfrpc.so.0()(64bit) \
libgfxdr.so.0()(64bit) \
libglusterfs.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.3)(64bit)"

inherit rpm
