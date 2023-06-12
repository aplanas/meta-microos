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

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_webdav-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "52d664b01f58c4764ff6b7a99a7c5dfbb9e8f14b48ee51e381fd7c29692e79220fd467aa0608487b249df404cc9046b705841a10e526c8e5d70cfa1005b85b4f"

RPROVIDES:${PN} += "config(lighttpd-mod_webdav) lighttpd-mod_webdav lighttpd-mod_webdav(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libsqlite3.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) lighttpd"

inherit rpm
