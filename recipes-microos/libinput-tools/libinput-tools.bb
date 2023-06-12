SUMMARY = "Utilities to display libinput configuration"
DESCRIPTION = "This tool lists the locally recognised devices and their respective \
configuration options and configuration defaults."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-tools-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "baa61d340a003f88b83a2795a68270374b5e56f3bd0dc3c393b95a2d17fbcb9247c7d95c9f675b80f9ba6a4149dff04cb69bbe94f2735738da1b8b4001ecafda"

RPROVIDES:${PN} += "libinput-tools \
libinput-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libevdev.so.2(LIBEVDEV_1_3)(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.14.0)(64bit) \
libinput.so.10(LIBINPUT_0.19.0)(64bit) \
libinput.so.10(LIBINPUT_0.20.0)(64bit) \
libinput.so.10(LIBINPUT_0.21.0)(64bit) \
libinput.so.10(LIBINPUT_1.1)(64bit) \
libinput.so.10(LIBINPUT_1.11)(64bit) \
libinput.so.10(LIBINPUT_1.14)(64bit) \
libinput.so.10(LIBINPUT_1.15)(64bit) \
libinput.so.10(LIBINPUT_1.19)(64bit) \
libinput.so.10(LIBINPUT_1.2)(64bit) \
libinput.so.10(LIBINPUT_1.21)(64bit) \
libinput.so.10(LIBINPUT_1.23)(64bit) \
libinput.so.10(LIBINPUT_1.3)(64bit) \
libinput.so.10(LIBINPUT_1.4)(64bit) \
libinput.so.10(LIBINPUT_1.5)(64bit) \
libinput.so.10(LIBINPUT_1.7)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
python3-libevdev"

inherit rpm
