SUMMARY = "Vietnamese input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-vietnamese-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "384a4996a78e2491a01037a6e922edcb152ee1da1fca1fbafe3b096d4dfe365d5c10a17e2e4776b44c3bb9154f4cbe19ec06c58790ad425300fd62c003ea8f9c"

RPROVIDES:${PN} += "gtk3-immodule-vietnamese gtk3-immodule-vietnamese(aarch-64) locale(gtk3:vi)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
