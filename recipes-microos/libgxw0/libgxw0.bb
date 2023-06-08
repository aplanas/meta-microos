SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "libgxw0-0.44.1-2.2.aarch64.rpm"
RPM_HASH = "8cdaabc34b8d562a78e7f860de498c19230289688e0070654752610f294d8153707045a559b78a26892f55877a094f3857f743d32ef1bb45a4f058bd81d0e10f"

RPROVIDES:${PN} += "libgxw.so.0()(64bit) libgxw0 libgxw0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
