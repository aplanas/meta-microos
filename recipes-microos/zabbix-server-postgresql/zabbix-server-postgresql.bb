SUMMARY = "Zabbix server with PostgreSQL support"
DESCRIPTION = "The Zabbix server compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-server-postgresql-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "a7800f60227ea940bb1c420ad062117c947e9010c142c4a0189dea15610dcd2ade80dcffa93e819b9b1407bac7b390c369d44296418573eed98b78be5aaf88ea"

RPROVIDES:${PN} += "zabbix zabbix-server-postgresql zabbix-server-postgresql(aarch-64) zabbix_server_binary"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenIPMI.so.0()(64bit) libOpenIPMIposix.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libevent-2.1.so.7()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnetsnmp.so.40()(64bit) libodbc.so.2()(64bit) libpcre.so.1()(64bit) libpq.so.5()(64bit) libssh2.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) postgresql update-alternatives zabbix-server"

inherit rpm
