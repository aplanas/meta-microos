SUMMARY = "Stand-alone compositor for X11"
DESCRIPTION = "Picom is a stand-alone compositor for X11. It supports both GLX and \
XRender backends and has various options to control shadows, blur \
and fade animations."
LICENSE = "MIT & MPL-2.0"

PV = "10.2"

RPM_NAME = "picom-10.2-1.3.aarch64.rpm"
RPM_HASH = "a979e9067f0c4751dd56618b302b022c4933d51a22621f35fe034ae497801058329d298952c67b1580826f1f0205bee7139747f1eb1f037bceb0af97a9c0b802"

RPROVIDES:${PN} += "application() application(picom.desktop) compton config(picom) picom picom(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGL.so.1()(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libconfig.so.11()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libev.so.4()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcre.so.1()(64bit) libpixman-1.so.0()(64bit) libxcb-composite.so.0()(64bit) libxcb-damage.so.0()(64bit) libxcb-glx.so.0()(64bit) libxcb-image.so.0()(64bit) libxcb-present.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb-render-util.so.0()(64bit) libxcb-render.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb-xfixes.so.0()(64bit) libxcb-xinerama.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
