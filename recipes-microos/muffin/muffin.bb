SUMMARY = "Cinnamon Desktop default window manager"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.0"

RPM_NAME = "muffin-5.2.0-1.9.aarch64.rpm"
RPM_HASH = "7fea9b6efc3c1c0b17d754b0c17e99429d7af8ff213f0b2d752fc6763df585b912534e5fa0a3712ae1ef68bf0b4c0b42d584f26180b888860aefd0c585555793"

RPROVIDES:${PN} += "application() application(muffin.desktop) libmuffin-clutter-0.so()(64bit) libmuffin-cogl-0.so()(64bit) libmuffin-cogl-pango-0.so()(64bit) libmuffin-cogl-path-0.so()(64bit) muffin muffin(aarch-64) windowmanager"
RDEPENDS:${PN} += "cinnamon-gschemas ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXrandr.so.2()(64bit) libXtst.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libfontconfig.so.1()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmuffin.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) zenity"

inherit rpm
