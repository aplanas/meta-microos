SUMMARY = "Configurable GPL-licensed FTP server software"
DESCRIPTION = "ProFTPD is a configurable FTP daemon for Unix and Unix-like \
operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "02726f0c2c208df001505951c561706cc0c9da5198346c00fb9b25ba7ff039cdc8262b4f98d286cf7280c833d10d0a7871a32d3cdb3bf576f595906d0cb439b6"

RPROVIDES:${PN} += "config(proftpd) proftpd proftpd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl group(ftp) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libhiredis.so.1.1.0()(64bit) libmemcached.so.11()(64bit) libmemcachedutil.so.2()(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpcre.so.1()(64bit) libpcreposix.so.0()(64bit) libsodium.so.23()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) logrotate user(ftp)"

inherit rpm
