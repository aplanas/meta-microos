SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-glib-2_0-8-0.42-1.3.aarch64.rpm"
RPM_HASH = "bba205190675edd6c813b42702022e3582e54b5d7ba722bd4b127c36dc73cf5190a91439c4c3b670df864068e547e26c9515acc05b910fe2c2d75eb3d086d73d"

RPROVIDES:${PN} += "libspice-client-glib-2.0.so.8()(64bit) \
libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) \
libspice-client-glib-2_0-8 \
libspice-client-glib-2_0-8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcacard.so.0()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopus.so.0()(64bit) \
libphodav-3.0.so.0()(64bit) \
libphodav-3.0.so.0(LIBPHODAV1_0.0)(64bit) \
libpixman-1.so.0()(64bit) \
libsasl2.so.3()(64bit) \
libsoup-3.0.so.0()(64bit) \
libspice-client-glib-helper \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libusb-1.0.so.0()(64bit) \
libusbredirhost.so.1()(64bit) \
libusbredirhost.so.1(USBREDIRHOST_0.8.0)(64bit) \
libusbredirparser.so.1()(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.8.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
