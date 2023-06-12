SUMMARY = "A Library for Interfacing IEEE 1284-Compatible Devices"
DESCRIPTION = "This library is intended to be used by applications that need to \
communicate with (or at least identify) devices that are attached via a \
parallel port."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.2.11"

RPM_NAME = "libieee12843-0.2.11-1.2.aarch64.rpm"
RPM_HASH = "e13d42d355d29c46997f6d2e6dfd79dd5941f37f9ad5e78cf28b2ec9c9cd71ed65bd9d98925c371eb9d54820315806d3337533cdcfdd2cc2781230161eca9f2a"

RPROVIDES:${PN} += "libieee1284.so.3()(64bit) \
libieee12843 \
libieee12843(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
