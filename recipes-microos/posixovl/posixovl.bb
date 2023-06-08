SUMMARY = "POSIX overlay filesystem"
DESCRIPTION = "A FUSE filesystem that provides POSIX functionality - UNIX-style permissions, \
ownership, special files - for filesystems that do not have such, e.g. vfat. It \
can be seen as a contemporary equivalent of the UMSDOS fs."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "posixovl-1.3-1.17.aarch64.rpm"
RPM_HASH = "55df24a3c2af14a6655648a2258b008c3ede01ea763ea19ae4628ac778e964055dd76facf881d6bfdfefe5578bc39781a9a733f84b57da289a3045106180f0a2"

RPROVIDES:${PN} += "posixovl posixovl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit)"

inherit rpm
