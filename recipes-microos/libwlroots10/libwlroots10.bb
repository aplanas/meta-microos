SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "libwlroots10-0.15.1-1.4.aarch64.rpm"
RPM_HASH = "5e75930e45bc67eb81a5d038399da3a5ba7e482b612e3c4045d8da69f4bab734e953fefbc5a9af6b85225c581c839db78484b747e94ca2b899e1bfd498ca40eb"

RPROVIDES:${PN} += "libwlroots.so.10()(64bit) libwlroots10 libwlroots10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libgbm.so.1()(64bit) libinput.so.10()(64bit) libinput.so.10(LIBINPUT_0.12.0)(64bit) libinput.so.10(LIBINPUT_0.20.0)(64bit) libinput.so.10(LIBINPUT_0.21.0)(64bit) libinput.so.10(LIBINPUT_1.2)(64bit) libinput.so.10(LIBINPUT_1.3)(64bit) libinput.so.10(LIBINPUT_1.4)(64bit) libinput.so.10(LIBINPUT_1.7)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpixman-1.so.0()(64bit) libseat.so.1()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libvulkan.so.1()(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit) libxcb-composite.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb-errors.so.0()(64bit) libxcb-icccm.so.4()(64bit) libxcb-present.so.0()(64bit) libxcb-render-util.so.0()(64bit) libxcb-render.so.0()(64bit) libxcb-res.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb-xinput.so.0()(64bit) libxcb.so.1()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
