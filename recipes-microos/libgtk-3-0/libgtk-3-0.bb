SUMMARY = "The GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "libgtk-3-0-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "3b52edea8d9970b7c2e60c4210e22d34121132c809e278d44e7046f55ef7e442a54901ceeb563ce2ad062a7428295a0e999fe3779f32fcc03b5d8b73a41f5353"

RPROVIDES:${PN} += "gtk3 libgailutil-3.so.0()(64bit) libgdk-3.so.0()(64bit) libgtk-3-0 libgtk-3-0(aarch-64) libgtk-3.so.0()(64bit) libgtk-3_0-0"
RDEPENDS:${PN} += "/sbin/ldconfig gdk-pixbuf-loader-rsvg gtk3-data gtk3-schema gtk3-tools hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libatk-1.0.so.0()(64bit) libatk-bridge-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libcolord.so.2()(64bit) libcups.so.2()(64bit) libepoxy.so.0()(64bit) libfontconfig.so.1()(64bit) libfribidi.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit) libwayland-egl.so.1()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
