SUMMARY = "Tigrigna input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-tigrigna-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "d73cee777b673f8aa5936a17baad8174d0e40f8a17d6833207642d67bc79383bf0cf221e3477d5b9a7b44afd763b8a9866ddaf89f6ecee62fbb09c641274259f"

RPROVIDES:${PN} += "gtk3-immodule-tigrigna gtk3-immodule-tigrigna(aarch-64) gtk3-immodules-tigrigna locale(gtk3:ti)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
