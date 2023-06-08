SUMMARY = "Library for developing Anjuta plugins"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "libanjuta-3-0-3.34.0-5.6.aarch64.rpm"
RPM_HASH = "8252f34c0ae75b973bae0e1d809fcc5dad99d749d146ea0e9500e3c943ee02f20a77978acfc5b5454d3b5ce9df12a5304cb7bd79198bbbcf8c449fd54d9a8c40"

RPROVIDES:${PN} += "libanjuta-3-0 libanjuta-3-0(aarch-64) libanjuta-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgdl-3.so.5()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
