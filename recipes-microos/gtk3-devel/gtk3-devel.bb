SUMMARY = "Development files for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 3.x."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-devel-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "d1c1e4592a115648166332f15a07e5cc13191ebd9ccaf54d40e83e176025baa0b3de63941cc96ac66df8fbb1aff74d890ab49ead20defb144e5bd354cd9cbb7d"

RPROVIDES:${PN} += "application() application(gtk3-demo.desktop) application(gtk3-widget-factory.desktop) gtk3-devel gtk3-devel(aarch-64) pkgconfig(gail-3.0) pkgconfig(gdk-3.0) pkgconfig(gdk-broadway-3.0) pkgconfig(gdk-wayland-3.0) pkgconfig(gdk-x11-3.0) pkgconfig(gtk+-3.0) pkgconfig(gtk+-broadway-3.0) pkgconfig(gtk+-unix-print-3.0) pkgconfig(gtk+-wayland-3.0) pkgconfig(gtk+-x11-3.0) rpm_macro(gtk3_immodule_post) rpm_macro(gtk3_immodule_postun) rpm_macro(gtk3_immodule_requires)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gettext-its-gtk3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libepoxy.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3-0 libgtk-3.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) pkgconfig(atk) pkgconfig(atk-bridge-2.0) pkgconfig(cairo) pkgconfig(cairo-gobject) pkgconfig(cairo-xlib) pkgconfig(epoxy) pkgconfig(fontconfig) pkgconfig(fribidi) pkgconfig(gdk-3.0) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(gtk+-3.0) pkgconfig(pango) pkgconfig(pangocairo) pkgconfig(pangoft2) pkgconfig(wayland-client) pkgconfig(wayland-cursor) pkgconfig(wayland-egl) pkgconfig(x11) pkgconfig(xcomposite) pkgconfig(xcursor) pkgconfig(xdamage) pkgconfig(xext) pkgconfig(xfixes) pkgconfig(xi) pkgconfig(xinerama) pkgconfig(xkbcommon) pkgconfig(xrandr) typelib-1_0-Gtk-3_0"

inherit rpm
