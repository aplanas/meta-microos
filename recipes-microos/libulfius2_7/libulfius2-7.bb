SUMMARY = "Web Framework for REST Applications in C"
DESCRIPTION = "The library is based on GNU libmicrohttpd for the backend web server, jansson \
for the json manipulation library, and libcurl for the HTTP/SMTP client API. \
 \
It can be used to create web applications in C programs."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "libulfius2_7-2.7.12-1.3.aarch64.rpm"
RPM_HASH = "ae427070f3d92db2baa089b2c29e53f8dbe2d1904dc3b1a5d0a19bc5a235fb54602ef16b1c2c47799fefd3df9703a551e5b2f2b0592c507ddff26e34b35b7fc7"

RPROVIDES:${PN} += "libulfius.so.2.7()(64bit) \
libulfius2_7 \
libulfius2_7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libmicrohttpd.so.12()(64bit) \
liborcania.so.2.3()(64bit) \
libyder.so.1.4()(64bit) \
libz.so.1()(64bit)"

inherit rpm
