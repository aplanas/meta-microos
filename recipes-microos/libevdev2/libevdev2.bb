SUMMARY = "Library for handling evdev kernel devices"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "libevdev2-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "32ae001947923ba6067971761b9336ba03e6fe2ae48fc5ccd946fbf93c1eeda459a400db9a67411b6a788185199969d9e13b9d94ce2a057a67fe745167bdf00a"

RPROVIDES:${PN} += "libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libevdev.so.2(LIBEVDEV_1_10)(64bit) \
libevdev.so.2(LIBEVDEV_1_3)(64bit) \
libevdev.so.2(LIBEVDEV_1_6)(64bit) \
libevdev.so.2(LIBEVDEV_1_7)(64bit) \
libevdev2 \
libevdev2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
