SUMMARY = "Zabbix proxy with MySQL support"
DESCRIPTION = "The Zabbix proxy compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-proxy-mysql-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "c5156f91321f797431da0de1e06ef79864f9ff2a90d8242c5dacbf2da30477b9da1e32e6d850380457bc4bed6f10b6b83384002937f23076a6b4f08e6bf5ed95"

RPROVIDES:${PN} += "zabbix zabbix-proxy-mysql zabbix-proxy-mysql(aarch-64) zabbix_proxy_binary"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenIPMI.so.0()(64bit) libOpenIPMIposix.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libevent-2.1.so.7()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmariadb_3)(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libnetsnmp.so.40()(64bit) libodbc.so.2()(64bit) libpcre.so.1()(64bit) libssh2.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) mariadb update-alternatives zabbix-proxy"

inherit rpm
