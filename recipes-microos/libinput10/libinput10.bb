SUMMARY = "Input device and event processing library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
It provides device detection, device handling, input device event \
processing and abstraction so minimize the amount of custom input \
code the user of libinput need to provide the common set of \
functionality that users expect."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput10-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "993a7fbcf0043fb3c2f160a4d50bf0e59f2ce6761e4bff66821f76aac0f910d3bf137d1625f6a633fa99af273c48616a545f339d871b986dc8b19b5ea8ffa048"

RPROVIDES:${PN} += "libinput.so.10()(64bit) libinput.so.10(LIBINPUT_0.12.0)(64bit) libinput.so.10(LIBINPUT_0.14.0)(64bit) libinput.so.10(LIBINPUT_0.15.0)(64bit) libinput.so.10(LIBINPUT_0.19.0)(64bit) libinput.so.10(LIBINPUT_0.20.0)(64bit) libinput.so.10(LIBINPUT_0.21.0)(64bit) libinput.so.10(LIBINPUT_1.1)(64bit) libinput.so.10(LIBINPUT_1.11)(64bit) libinput.so.10(LIBINPUT_1.14)(64bit) libinput.so.10(LIBINPUT_1.15)(64bit) libinput.so.10(LIBINPUT_1.19)(64bit) libinput.so.10(LIBINPUT_1.2)(64bit) libinput.so.10(LIBINPUT_1.21)(64bit) libinput.so.10(LIBINPUT_1.23)(64bit) libinput.so.10(LIBINPUT_1.3)(64bit) libinput.so.10(LIBINPUT_1.4)(64bit) libinput.so.10(LIBINPUT_1.5)(64bit) libinput.so.10(LIBINPUT_1.7)(64bit) libinput.so.10(LIBINPUT_1.9)(64bit) libinput10 libinput10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libevdev.so.2()(64bit) libevdev.so.2(LIBEVDEV_1)(64bit) libevdev.so.2(LIBEVDEV_1_10)(64bit) libevdev.so.2(LIBEVDEV_1_3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmtdev.so.1()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libwacom.so.9()(64bit) libwacom.so.9(LIBWACOM_2.0)(64bit)"

inherit rpm
