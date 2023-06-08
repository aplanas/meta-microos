SUMMARY = "Writing application"
DESCRIPTION = "A fullscreen word processor for Elementary OS."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "quilter-3.3.4-1.11.aarch64.rpm"
RPM_HASH = "f63fca0ad31eadfd3848ab4fca4fb7114eccb8c46741281448eb3f39831faeb11063f703b7a9a5c2f1e527db3b193ba4691d3698bdff0e67d367101488f8bffb"

RPROVIDES:${PN} += "application() application(io.github.lainsce.Quilter.desktop) metainfo() metainfo(io.github.lainsce.Quilter.appdata.xml) mimehandler(text/markdown) mimehandler(text/x-markdown) quilter quilter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libgtkspell3-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libmarkdown.so.3()(64bit) libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
