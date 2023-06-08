SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-gtk-3_0-5-0.42-1.3.aarch64.rpm"
RPM_HASH = "dbb35814e6ec9aecd34ebe31a11668c941d7bc2f00f0caca55b86793f6ba4df31e6a359eb55d6567543f1b9fd45616a808e3024514faa9fd9b791f312965641e"

RPROVIDES:${PN} += "libspice-client-gtk-3.0.so.5()(64bit) libspice-client-gtk-3.0.so.5(SPICEGTK_1)(64bit) libspice-client-gtk-3_0-5 libspice-client-gtk-3_0-5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libepoxy.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libphodav-3.0.so.0()(64bit) libphodav-3.0.so.0(LIBPHODAV1_0.0)(64bit) libspice-client-glib-2.0.so.8()(64bit) libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
