SUMMARY = "Library to access RESTful web services"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
It is comprised of two parts: \
 \
    * the first aims to make it easier to make requests by providing a \
      wrapper around libsoup. \
    * the second aids with XML parsing by wrapping libxml2."
LICENSE = "LGPL-2.1-only"

PV = "0.9.1"

RPM_NAME = "librest-1_0-0-0.9.1-3.1.aarch64.rpm"
RPM_HASH = "ef36eb0fc2b22b5385d25bb43dba48d732a44c41cc57f79b50af17b98b312a461e1b106b273ee72b0d0ece4c41463e12ef3b9036f4575b5f0960b52d24c9b5d6"

RPROVIDES:${PN} += "librest-1.0.so.0()(64bit) \
librest-1_0-0 \
librest-1_0-0(aarch-64) \
librest-extras-1.0.so.0()(64bit) \
librest0"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
