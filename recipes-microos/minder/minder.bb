SUMMARY = "Mind-mapping app"
DESCRIPTION = "A program to create, develop, visualize, organize and manage ideas."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.0"

RPM_NAME = "minder-1.14.0-1.8.aarch64.rpm"
RPM_HASH = "9dfd9fe5bc172b8e2eafbd763aa12187bcdea7565215d83f0f7e86e2b6c099c299f6519e8b0133355544ad5328bfb73d468a3a678fa5219d1584aab4078d9fbb"

RPROVIDES:${PN} += "application() \
application(com.github.phase1geo.minder.desktop) \
metainfo() \
metainfo(com.github.phase1geo.minder.appdata.xml) \
mimehandler(application/com.github.phase1geo.minder) \
minder \
minder(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmarkdown.so.3()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
