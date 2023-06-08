SUMMARY = "ISO 9660 Rock Ridge Filesystem Manipulator"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
Vice versa xorriso is able to restore file objects from ISO 9660 filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "xorriso-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "da8beb39f9a55764006a5073709125e2c26c1182c5bf76981de04316b471b9f176f82c29384fc1ebe635bf4bd031dc67e522fff2cc8ca209baeafe12842e3937"

RPROVIDES:${PN} += "libburnia-tools libburnia-tools-x11 xorriso xorriso(aarch-64)"
RDEPENDS:${PN} += "/bin/sh info ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libisoburn.so.1()(64bit) libisoburn.so.1(LIBISOBURN1)(64bit)"

inherit rpm
