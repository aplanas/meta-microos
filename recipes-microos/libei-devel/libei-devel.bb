SUMMARY = "Header files for libei, a library for emulated input under Wayland"
DESCRIPTION = "libei is a library for Emulated Input, targeting the Wayland stack."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "libei-devel-0.5-1.1.aarch64.rpm"
RPM_HASH = "25e11ac2fb248be712a4340cc2fda0d40af304b21bcd4e1c497b72c6ebf57f645c06044c3add2864cbdc4de8ff8e7686d19cef51283d2f480aabe29c1366ee7a"

RPROVIDES:${PN} += "libei-devel libei-devel(aarch-64) pkgconfig(libei) pkgconfig(libeis) pkgconfig(liboeffis)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libei-suse4 libei.so.suse4()(64bit) libevdev.so.2()(64bit) libevdev.so.2(LIBEVDEV_1)(64bit) pkgconfig(libsystemd)"

inherit rpm
