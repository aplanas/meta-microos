SUMMARY = "Broadway input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Broadway."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-immodule-broadway-3.24.37+70-1.1.aarch64.rpm"
RPM_HASH = "0d4645ac3ec656dd6ec94d6f26997b49dd415dca93a39ea2bb1bdf5a482d05b177500e8210bfb27155d5787cf6eee7a0fee471678428c29475fd4fc84919f188"

RPROVIDES:${PN} += "gtk3-immodule-broadway gtk3-immodule-broadway(aarch-64)"
RDEPENDS:${PN} += "gtk3 gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
