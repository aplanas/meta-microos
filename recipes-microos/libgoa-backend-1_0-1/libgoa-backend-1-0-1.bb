SUMMARY = "GNOME service to access online accounts -- Backend Library"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "libgoa-backend-1_0-1-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "b130e25968c5eadfe109ac04b5b082548ed91266a402265e4d9d98afb981b9827cebe1653dc55319913fc58b503021e72e87e4511c0af4251226fecbd5c2a5f4"

RPROVIDES:${PN} += "libgoa-backend-1.0.so.1()(64bit) \
libgoa-backend-1_0-1 \
libgoa-backend-1_0-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcr-base-3.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjavascriptcoregtk-4.1.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
librest-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit)"

inherit rpm
