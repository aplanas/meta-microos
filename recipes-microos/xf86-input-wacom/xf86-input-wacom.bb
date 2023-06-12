SUMMARY = "Wacom input driver for the Xorg X server"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-0.40.0-2.7.aarch64.rpm"
RPM_HASH = "75c15dea3fcd2353eeab9b4d1e3461e2043ff7b8c47bbcd476249bd834608117b27c74538f9fa16136162c6330a4b870e328eebb45ef7dd44e2c202930173d61"

RPROVIDES:${PN} += "x11-input-wacom \
x11-input-wacom-tools \
xf86-input-wacom \
xf86-input-wacom(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
X11_ABI_XINPUT \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
pkgconfig(udev)"

inherit rpm
