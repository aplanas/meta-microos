SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "libfuse2-2.9.9-6.3.aarch64.rpm"
RPM_HASH = "3126b7005581410c60460a623b7fd82a1b5276005736aa481e3fe91276fb03c1b89881befd37cf0ec02896350deb21ed3101f382141c18fcf7516b0520fa01ac"

RPROVIDES:${PN} += "libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.4)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.7)(64bit) libfuse.so.2(FUSE_2.7.5)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libfuse.so.2(FUSE_2.9)(64bit) libfuse.so.2(FUSE_2.9.1)(64bit) libfuse2 libfuse2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
