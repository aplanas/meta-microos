SUMMARY = "Screen Locker for the i3 Window Manager"
DESCRIPTION = "i3lock is a simple screen locker like slock. After starting it, you will see a \
white screen (you can configure the color/an image). You can return to your \
screen by entering your password."
LICENSE = "BSD-3-Clause"

PV = "2.13"

RPM_NAME = "i3lock-2.13-2.3.aarch64.rpm"
RPM_HASH = "2668718ba81d55a39fc0b96ff9f83f18b385054d78c20e02cc6a2752f8925f39c064c50630a57cf97256ca479435de84cc490953ad06eddb250740f013f2a4c3"

RPROVIDES:${PN} += "i3lock i3lock(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libev.so.4()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libxcb-image.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb-util.so.1()(64bit) libxcb-xinerama.so.0()(64bit) libxcb-xkb.so.1()(64bit) libxcb-xrm.so.0()(64bit) libxcb.so.1()(64bit) libxkbcommon-x11.so.0()(64bit) libxkbcommon-x11.so.0(V_0.5.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
