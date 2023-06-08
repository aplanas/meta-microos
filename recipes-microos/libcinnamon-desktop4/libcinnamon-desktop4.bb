SUMMARY = "Libcinnamon-desktop API"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
The libcinnamon-desktop library provides API shared by several \
applications on the desktop, but that cannot live in the platform \
for various reasons. There is no API or ABI guarantee, although we \
are doing our best to provide stability. Documentation for the API \
is available with gtk-doc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "libcinnamon-desktop4-5.6.2-1.1.aarch64.rpm"
RPM_HASH = "5f62d9fb6809bed11b9ee94dba9681ceebe2757639808fc46891ff3c0042e07e78e6479d62b4b06088873b30508ac4aa9ecf47873721d80326a62c5b04512f72"

RPROVIDES:${PN} += "cinnamon-desktop libcinnamon-desktop libcinnamon-desktop.so.4()(64bit) libcinnamon-desktop4 libcinnamon-desktop4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libcinnamon-desktop-data libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libxkbfile.so.1()(64bit)"

inherit rpm
