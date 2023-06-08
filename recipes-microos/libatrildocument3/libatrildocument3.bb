SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "libatrildocument3-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "f4711bcfc91e38eb0dd83faffde19b2fe174272d341bec2794a5f079a7e3e829504904465a55fe0ec8650122ef36ee7914eb32334ca1a8ee3ce4ef3a6d5d3129"

RPROVIDES:${PN} += "libatrildocument.so.3()(64bit) libatrildocument3 libatrildocument3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.35)(64bit) libsynctex.so.2()(64bit)"

inherit rpm
