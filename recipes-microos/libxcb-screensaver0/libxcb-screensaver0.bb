SUMMARY = "X11 ScreenSaver Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-screensaver0-1.15-2.2.aarch64.rpm"
RPM_HASH = "8c6391cddaf5b34af7197e19ffc73e58259013c4a03e215e121f42205ce288911bdd0ff8bfc3fe1e220bcfbfea248f8af9a3ef5fdd90f1fb0a3c53b2ee13a0b8"

RPROVIDES:${PN} += "libxcb-screensaver.so.0()(64bit) libxcb-screensaver0 libxcb-screensaver0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
