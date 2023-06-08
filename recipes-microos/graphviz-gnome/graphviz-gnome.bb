SUMMARY = "Graphviz plugins that use gtk/GNOME"
DESCRIPTION = "Graphviz plugins that use gtk/GNOME."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gnome-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "199c944648f24778e3407d4e507154e868fe743790a26598d70508721dc1ed86bd5df92fb66a1b2ace0c895410da190d24102fe3d68d78deebedceef41198119"

RPROVIDES:${PN} += "graphviz-gnome graphviz-gnome(aarch-64) libgvplugin_gdk.so.6()(64bit) libgvplugin_gs.so.6()(64bit) libgvplugin_gtk.so.6()(64bit) libgvplugin_pango.so.6()(64bit) libgvplugin_rsvg.so.6()(64bit) libgvplugin_xlib.so.6()(64bit)"
RDEPENDS:${PN} += "/bin/sh graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libcgraph.so.6()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgs.so.9()(64bit) libgtk-x11-2.0.so.0()(64bit) libgvc.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
