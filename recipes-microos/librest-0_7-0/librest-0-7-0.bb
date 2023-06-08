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

PV = "0.8.1"

RPM_NAME = "librest-0_7-0-0.8.1-2.3.aarch64.rpm"
RPM_HASH = "f666e4e7f6051ab2fb082f3515623368de0385740d61d006178d6a75b0fcc6c81b6e4257da8c63883702ae78457cb47609fb8a3bc9860ee2473dd14b2fcf4a1b"

RPROVIDES:${PN} += "librest-0.7.so.0()(64bit) librest-0_7-0 librest-0_7-0(aarch-64) librest-extras-0.7.so.0()(64bit) librest0"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsoup-2.4.so.1()(64bit) libsoup-gnome-2.4.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
