SUMMARY = "Multipress input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method which allows text entry via the \
multi-press method, as on a mobile phone."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-multipress-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "3e9d68466f8d66f460cba9fdc48c1f32f8ff5c96d46dc8c16e0d4d27c650c8c4a22e4836fd7eee499bce8fd8fe5912e57e5b96d236688ebbbe0ed922b6b5548a"

RPROVIDES:${PN} += "config(gtk3-immodule-multipress) gtk3-immodule-multipress gtk3-immodule-multipress(aarch-64)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
