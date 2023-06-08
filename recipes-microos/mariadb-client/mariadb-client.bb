SUMMARY = "Client for MariaDB"
DESCRIPTION = "This package contains the standard clients for MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.2"

RPM_NAME = "mariadb-client-10.11.2-2.3.aarch64.rpm"
RPM_HASH = "dd1d382ef0a55048dab8a5b29573f2abe7b6c111a706573e36ee0a7ec52060c205c919755cde3c897b7816162fa17e574ce5ec8e1dfce772287813a671f85f4e"

RPROVIDES:${PN} += "config(mariadb-client) group(mysql) mariadb-client mariadb-client(aarch-64) mysql-client user(mysql)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libedit.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmariadb3 libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libz.so.1()(64bit) mariadb-errormessages sysuser-shadow"

inherit rpm
