SUMMARY = "Gnome Devtool Libraries"
DESCRIPTION = "Gnome Devtool Libraries contains components and libraries that are \
intended to be shared between GNOME development tools, including \
gnome-debug, gnome-build, and anjuta2."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "libgdl-3-5-3.40.0-2.9.aarch64.rpm"
RPM_HASH = "83c7da38086f94e4b4774f20bceb10849d048be4d8d734d23cf3c17cab69b41ba6c3ba7f9dc014a017432f5afc77555a7f6863fbb98376d1035b21cf14bc3e0c"

RPROVIDES:${PN} += "gdl libgdl-3-5 libgdl-3-5(aarch-64) libgdl-3.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
