SUMMARY = "Shared library to query and update monitor settings"
DESCRIPTION = "Shared library version of ddcutil, exposing a C API. \
 \
ddcutil communicates with monitors implementing MCCS (Monitor Control Command \
Set), using either the DDC/CI protocol on the I2C bus or as a Human Interface \
Device on USB."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libddcutil4-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "0f30f06cb831d267f88781d530ce8d37da0a9fd184de80fd35ccd425acf94f3e26cc3591478eb6143e8c52682c59089fac062bb35949d6b0d9d263c62ebc72ec"

RPROVIDES:${PN} += "libddcutil.so.4()(64bit) libddcutil4 libddcutil4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
