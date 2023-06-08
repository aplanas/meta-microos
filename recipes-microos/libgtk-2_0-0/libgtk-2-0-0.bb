SUMMARY = "The GTK+ toolkit library (version 2)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "libgtk-2_0-0-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "d3cd055e0c8cf0542e70ba07a24ff9323a224c87a53e92214863f318f45bf86af884e5dd9e4769d0028c4267fec95631356c9ba79431a53cdef427046b01d571"

RPROVIDES:${PN} += "gail gtk2 libgail.so()(64bit) libgailutil.so.18()(64bit) libgdk-x11-2.0.so.0()(64bit) libgtk-2_0-0 libgtk-2_0-0(aarch-64) libgtk-x11-2.0.so.0()(64bit) libpixmap.so()(64bit) libprintbackend-cups.so()(64bit) libprintbackend-file.so()(64bit) libprintbackend-lpr.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig gtk2-tools hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libcups.so.2()(64bit) libfontconfig.so.1()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit)"

inherit rpm
