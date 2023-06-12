SUMMARY = "Graphviz plugins that use gtk/GNOME"
DESCRIPTION = "Graphviz plugins that use gtk/GNOME."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gnome-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "5370c5635f6b8741291c6156f4969ee54206b0d8ba22ee6d8c8ef45eb2cc785f0c512011c3bf6bb2d24f90cda5f9f8795294b8aeae7483073f2b781d1f488e5b"

RPROVIDES:${PN} += "graphviz-gnome graphviz-gnome(aarch-64) libgvplugin_gdk.so.6()(64bit) libgvplugin_gs.so.6()(64bit) libgvplugin_gtk.so.6()(64bit) libgvplugin_pango.so.6()(64bit) libgvplugin_rsvg.so.6()(64bit) libgvplugin_xlib.so.6()(64bit)"
RDEPENDS:${PN} += "/bin/sh graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libcgraph.so.6()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgs.so.9()(64bit) libgtk-x11-2.0.so.0()(64bit) libgvc.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
