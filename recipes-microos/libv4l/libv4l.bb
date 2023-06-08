SUMMARY = "Collection of video4linux support libraries"
DESCRIPTION = "libv4l is a collection of libraries which adds a thin abstraction layer on \
top of video4linux2 devices. The purpose of this (thin) layer is to make it \
easy for application writers to support a wide variety of devices without \
having to write separate code for different devices in the same class."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "19b0d476621b9ce1a2a1ca652618fdbe7ed3e147d3c354a21667bdc5d9a9fabe9e348c32d26c3ffa675242a4f896067e2b1aa297db1e36e439cf6f67bd087714"

RPROVIDES:${PN} += "libv4l libv4l(aarch-64) libv4l-mplane.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libv4l1.so.0()(64bit) libv4l2.so.0()(64bit)"

inherit rpm
