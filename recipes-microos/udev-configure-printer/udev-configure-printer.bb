SUMMARY = "Utility to autoconfigure printers when plugged"
DESCRIPTION = "This package contains an utility that will ensure printers get \
automatically configured when plugged on the computer."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "udev-configure-printer-1.5.18-2.1.aarch64.rpm"
RPM_HASH = "b7417193c136c942604b2456c6f8ee9656aa4345bd67b07dc943193cc39a56d20b3d6798414b7eb627d1205096df6737e92235c49fa3cd278a4bda748069e44b"

RPROVIDES:${PN} += "udev-configure-printer \
udev-configure-printer(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcups.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libusb-1.0.so.0()(64bit) \
python3-cups \
python3-cupshelpers \
systemd"

inherit rpm
