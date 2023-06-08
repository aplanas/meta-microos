SUMMARY = "EPUB document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read EPUB documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-epubdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "70b8ea10d3a840037707c779865e869c229e6b30183bfb81b7434e744dacc3342120a78af969034bec55d97f5f567d0dc929d9bfcb03dd82725ac0d32dbf0e8d"

RPROVIDES:${PN} += "libepubdocument.so()(64bit) xreader-plugin-epubdocument xreader-plugin-epubdocument(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxreaderdocument.so.3()(64bit) libz.so.1()(64bit) xreader"

inherit rpm
