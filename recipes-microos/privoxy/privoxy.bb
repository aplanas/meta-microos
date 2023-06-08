SUMMARY = "The Internet Junkbuster - HTTP Proxy Server"
DESCRIPTION = "The Internet Junkbuster - HTTP Proxy Server: A non-caching HTTP proxy \
server that runs between a web browser and a web server and filters \
contents as described in the configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.34"

RPM_NAME = "privoxy-3.0.34-1.3.aarch64.rpm"
RPM_HASH = "3005541b41db70242bbf0271e2cb48c30fdb683ead2dbcc6029719ae7dbb6af424a9ef587c583e5f8ce115562a97416b0329d3ebd418b9b1b02543f61a6d81a1"

RPROVIDES:${PN} += "config(privoxy) privoxy privoxy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/groupadd /usr/sbin/useradd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libpcre.so.1()(64bit) libpcreposix.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) logrotate"

inherit rpm
