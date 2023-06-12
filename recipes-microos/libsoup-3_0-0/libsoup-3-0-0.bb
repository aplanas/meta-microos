SUMMARY = "HTTP client/server library for GNOME"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
Features: \
  * Both asynchronous (GMainLoop and callback-based) and synchronous APIs \
  * Automatically caches connections \
  * SSL Support using GnuTLS \
  * Proxy support, including authentication and SSL tunneling \
  * Client support for Digest, NTLM, and Basic authentication \
  * Server support for Digest and Basic authentication \
  * XML-RPC support"
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.2"

RPM_NAME = "libsoup-3_0-0-3.4.2-1.1.aarch64.rpm"
RPM_HASH = "9e3f92c7af6614962ee393f2559db0a6c8692d32a3f7d80ba5b70055cecff5ff929e0234a7853b7bbf0364118b9f5b4f55f55afc197502438ec512e648aebe19"

RPROVIDES:${PN} += "libsoup \
libsoup-3.0.so.0()(64bit) \
libsoup-3_0-0 \
libsoup-3_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
glib-networking \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrotlidec.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libnghttp2.so.14()(64bit) \
libpsl.so.5()(64bit) \
libsqlite3.so.0()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
