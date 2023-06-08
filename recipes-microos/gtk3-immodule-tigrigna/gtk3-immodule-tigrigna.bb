SUMMARY = "Tigrigna input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-tigrigna-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "39bc1bcbd5661526069c862563ce59586a63e9ce99d7d181ed68e63169462bbabb54a3cbd43e0e44b63c4ed42829c7bf689a3a87f5d0739297e6dc60738449d6"

RPROVIDES:${PN} += "gtk3-immodule-tigrigna gtk3-immodule-tigrigna(aarch-64) gtk3-immodules-tigrigna locale(gtk3:ti)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
