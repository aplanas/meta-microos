SUMMARY = "HTML plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "valadoc-doclet-html-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "015c44b789de527a6f59002a7d845e7473ef9f10d5530fb1593d5b0a1781b4fe6d549d9f7a3beaf86e16ccce0865da2fb7dff6530f69dee55fc28b5c0ac202a8"

RPROVIDES:${PN} += "libdoclet.so()(64bit) valadoc-doclet-html valadoc-doclet-html(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libvaladoc-0.56.so.0()(64bit)"

inherit rpm
