SUMMARY = "Library for the Plank dock"
DESCRIPTION = "Plank is a trivial dock. \
It is, however, a library which can be extended to create other \
dock programs with more advanced features."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "libplank1-0.11.89-2.4.aarch64.rpm"
RPM_HASH = "9ea0061d611e80c8fac2e8adf1bbf58cf342ee99cd286ea6cff7839afaa0a88ec310738f4a2765656c9ad6cfaa8fc062d2e51f33b2443cb793cdb68fc41f3488"

RPROVIDES:${PN} += "libplank.so.1()(64bit) \
libplank1 \
libplank1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libbamf3.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdbusmenu-glib.so.4()(64bit) \
libdbusmenu-gtk3.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
