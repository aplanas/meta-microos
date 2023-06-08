SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.14.1"

RPM_NAME = "libfuse3-3-3.14.1-1.1.aarch64.rpm"
RPM_HASH = "c4eaa8031757ef5d78ac193ca1ba6e778204fa8bf45ebcafb0522f46cddaab07bd21e43ed95c5b21e0813af8f60f3591378124a453b2ddcf5378786341fb4c59"

RPROVIDES:${PN} += "libfuse3-3 libfuse3-3(aarch-64) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) libfuse3.so.3(FUSE_3.1)(64bit) libfuse3.so.3(FUSE_3.12)(64bit) libfuse3.so.3(FUSE_3.2)(64bit) libfuse3.so.3(FUSE_3.3)(64bit) libfuse3.so.3(FUSE_3.4)(64bit) libfuse3.so.3(FUSE_3.7)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
