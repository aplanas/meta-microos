SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-tools-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "439423c695d0382e911190eb214f5a5ded3a16152b8cf272020380165b277cafc4c2f4c0be53a20472d4b17d1b47e8e5f03942c515f6d9c2c583d9927508694e"

RPROVIDES:${PN} += "application() application(gtk3-icon-browser.desktop) gtk3-tools gtk3-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) update-alternatives"

inherit rpm
