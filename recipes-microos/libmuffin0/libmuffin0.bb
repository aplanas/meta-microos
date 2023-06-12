SUMMARY = "Muffin shared libraries"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides Muffin's shared libraries."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.1"

RPM_NAME = "libmuffin0-5.2.1-1.1.aarch64.rpm"
RPM_HASH = "f206187d6a05e18359ba049b81c865ce94182fa76335a3019b2c3e1d21911a52afc93198eed72e1bf40ce97ad5d7a37bbc3444de99014fdb05d5d445c2193ac9"

RPROVIDES:${PN} += "libmuffin.so.0()(64bit) libmuffin0 libmuffin0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libgirepository-1.0.so.1()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmuffin-clutter-0.so()(64bit) libmuffin-cogl-0.so()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstartup-notification-1.so.0()(64bit) libxcb-res.so.0()(64bit)"

inherit rpm
