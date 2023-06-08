SUMMARY = "Amharic input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-amharic-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "4901a3f1750440e10a2d36aae1fef276019a6ba5c22c8beadc54a364db8c5db6a417ab54bfa3129d97187c8ac34e1767c5aa070d27fd98c6580e2e18a91cab4e"

RPROVIDES:${PN} += "gtk3-immodule-amharic gtk3-immodule-amharic(aarch-64) locale(gtk3:am)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
