SUMMARY = "Inuktitut input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Inuktitut."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-inuktitut-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "cabd3ce036b412b1940881fd666b3668e983421e2c96f3bf124df289d8205eafd52c7fa6d34255c0ae8e608efafd07434ada6a004bbe23b0c32be9ae6b422cee"

RPROVIDES:${PN} += "gtk3-immodule-inuktitut gtk3-immodule-inuktitut(aarch-64) locale(gtk3:iu)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
