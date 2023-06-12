SUMMARY = "Wayland Reference Compositor"
DESCRIPTION = "Weston is the reference implementation of a Wayland compositor, and a \
useful compositor in its own right. Weston has various backends that \
lets it run on Linux kernel modesetting and evdev input as well as \
under X11. Weston ships with a few example clients, from simple \
clients that demonstrate certain aspects of the protocol to more \
complete clients and a simplistic toolkit. There is also a quite \
capable terminal emulator (weston-terminal) and an toy/example \
desktop shell. Finally, weston also provides integration with the \
Xorg server and can pull X clients into the Wayland desktop and act \
as a X window manager."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.1"

RPM_NAME = "weston-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "4d8c88ea34c1117526c9d0d9a988a874c762abf790d2c7bf548458c6a36c30521399d494fd9c44fe5893d14bcea448bf718078619d54c1db8e0a34c400395190"

RPROVIDES:${PN} += "libexec_weston.so.0()(64bit) \
weston \
weston(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.14.0)(64bit) \
libinput.so.10(LIBINPUT_0.19.0)(64bit) \
libinput.so.10(LIBINPUT_0.21.0)(64bit) \
libinput.so.10(LIBINPUT_1.1)(64bit) \
libinput.so.10(LIBINPUT_1.2)(64bit) \
libinput.so.10(LIBINPUT_1.4)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libwebp.so.7()(64bit) \
libweston-12.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
vpx-tools \
xkeyboard-config"

inherit rpm
