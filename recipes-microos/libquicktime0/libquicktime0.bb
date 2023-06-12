SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime0-1.2.4+git20180804.fff99cd-4.1.aarch64.rpm"
RPM_HASH = "cdabf9eaa754a203233c383feaf3580a966416505f17c70732dc4b62ae27565f5ce56a7aef4a0d29dff2712ae9c7bc0b927595f18d5b107547d696d668f26877"

RPROVIDES:${PN} += "libquicktime.so.0()(64bit) \
libquicktime0 \
libquicktime0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
