SUMMARY = "WebDAV module for Lighttpd"
DESCRIPTION = "The WebDAV module is a very minimalistic implementation of RFC 2518. \
Minimalistic means that not all operations are implementated yet.. \
 \
So far we have: \
* PROPFIND \
* OPTIONS \
* MKCOL \
* DELETE \
* PUT \
and the usual GET, POST, HEAD from HTTP/1.1.. \
 \
So far mounting a webdav resource into Windows XP works and the basic \
litmus tests are passed."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_webdav-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "3e66f89cc67f71d791663f70932d118439a0f612abef338d5d333be8406182bc6a4b5f7c90912ddbd94f42f576e2efbf9da9ce399d9f41957e31a1070b778a51"

RPROVIDES:${PN} += "config(lighttpd-mod_webdav) lighttpd-mod_webdav lighttpd-mod_webdav(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libsqlite3.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) lighttpd"

inherit rpm
