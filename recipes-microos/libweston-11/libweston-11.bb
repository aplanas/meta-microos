SUMMARY = "Weston rendering backend collection"
DESCRIPTION = "This subpackage contains backend renderer plugins, used by \
libweston-11-0."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "11"

RPM_NAME = "libweston-11-11-3.1.aarch64.rpm"
RPM_HASH = "00d8318a1d16d68883226624ba2e4cadbe1a1135de2999452a0fefd515731aa20cf32e6bbf3ef692c4d3dafd6ab2d4b4ed09aaff90d922b439ee9a11136e8e3b"

RPROVIDES:${PN} += "libweston-11 libweston-11(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdrm.so.2()(64bit) libfreerdp-server2.so.2()(64bit) libfreerdp2.so.2()(64bit) libgbm.so.1()(64bit) libinput.so.10()(64bit) libinput.so.10(LIBINPUT_0.12.0)(64bit) libinput.so.10(LIBINPUT_0.21.0)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libseat.so.1()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_213)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libva-drm.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit) libwayland-egl.so.1()(64bit) libwayland-server.so.0()(64bit) libwebp.so.7()(64bit) libweston-11.so.0()(64bit) libwinpr2.so.2()(64bit) libxcb-composite.so.0()(64bit) libxcb-render.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb-xkb.so.1()(64bit) libxcb.so.1()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
