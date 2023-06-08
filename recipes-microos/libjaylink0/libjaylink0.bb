SUMMARY = "USB interface library for J-Link"
DESCRIPTION = "Library for accessing Segger J-Link USB devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink0-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "20141b25f47641f0a3eb991f57e8bc4e4be177f3d8b51cb610226012f75f2c63214889e7f895a7420d23de66dcdef32029c9c1434899b86f8533d46524edd829"

RPROVIDES:${PN} += "libjaylink.so.0()(64bit) libjaylink0 libjaylink0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
