SUMMARY = "Multipress input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method which allows text entry via the \
multi-press method, as on a mobile phone."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-multipress-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "461e8adbbaa137e78f1686f6a6cb22b51132083c12402d0bb18b6164f72ddcaa054d099ee2470810e7a66f6c3335c317e9b28c773f3f5d3fd175194e2e64f3f7"

RPROVIDES:${PN} += "config(gtk3-immodule-multipress) gtk3-immodule-multipress gtk3-immodule-multipress(aarch-64)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
