SUMMARY = "A mail filtering utility"
DESCRIPTION = "IMAPFilter is a mail filtering utility. It connects to remote mail \
servers using the Internet Message Access Protocol (IMAP), sends \
searching queries to the server and processes mailboxes based on the \
results. It can be used to delete, copy, move, flag, etc. messages \
residing in mailboxes at the same or different mail servers. The 4rev1 \
and 4 versions of the IMAP protocol are supported. \
 \
IMAPFilter uses the Lua programming language as a configuration and \
extension language."
LICENSE = "MIT"

PV = "2.7.6"

RPM_NAME = "imapfilter-2.7.6-1.3.aarch64.rpm"
RPM_HASH = "069b1ab647e2c462502137e43e5682427cf8c329b429582ca4b04471066b711346680eae7c8992737a567d0582cfa657932884d8b0b04f72069413b0446330d1"

RPROVIDES:${PN} += "imapfilter imapfilter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblua5.4.so.5()(64bit) libpcre2-8.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
