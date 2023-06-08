SUMMARY = "Tools and libraries for USB devices"
DESCRIPTION = "This package contains a utility for inspecting devices connected to USB \
ports."
LICENSE = "GPL-2.0-or-later"

PV = "015"

RPM_NAME = "usbutils-015-1.3.aarch64.rpm"
RPM_HASH = "41d3b8a0b5b044e3e0e54aa655d20b69701c2f1c3f6baea6b1d4488e37e4ee47c61c96694e08133a12af17c629d233dc89da5a99b547f047e3e3ee46041f9b89"

RPROVIDES:${PN} += "usbutils usbutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 hwdata ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_196)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
