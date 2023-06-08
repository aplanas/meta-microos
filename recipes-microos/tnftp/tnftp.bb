SUMMARY = "Enhanced FTP Client"
DESCRIPTION = "tnftp is the FTP (File Transfer Protocol) client from NetBSD.  FTP is a widely \
used protocol for transferring files over the Internet and for archiving files. \
tnftp provides some advanced features beyond the Linux netkit ftp client, but \
maintains a similar user interface to the traditional ftp client.  It was \
formerly called lukemftp."
LICENSE = "BSD-3-Clause"

PV = "20210827"

RPM_NAME = "tnftp-20210827-1.5.aarch64.rpm"
RPM_HASH = "291b53ce5098144040c9e8facbb38809db48c5026f8899ec374a9fe187c3cc080c2a89ba7e744b5fd2cc0f46c555d8ceb92f708c9d9f414262c20e38d1251ca9"

RPROVIDES:${PN} += "lukemftp nkitb:/usr/bin/ftp tnftp tnftp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libedit.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) update-alternatives"

inherit rpm
