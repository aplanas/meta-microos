SUMMARY = "A Sticky Note App"
DESCRIPTION = "A sticky notes application for any type of short term notes \
or ideas."
LICENSE = "GPL-3.0-only"

PV = "3.4.9"

RPM_NAME = "notejot-3.4.9-1.7.aarch64.rpm"
RPM_HASH = "507c2ee024338ecab34af7de609e7fe00fd7f79268a1862dcff6799b10370880c93727e535e25277ae0cf988ca6482e7999c575bc832bb99dc2d9fb31a878cbd"

RPROVIDES:${PN} += "application() application(io.github.lainsce.Notejot.desktop) metainfo() metainfo(io.github.lainsce.Notejot.appdata.xml) notejot notejot(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit)"

inherit rpm
