SUMMARY = "Zabbix proxy with PostgreSQL support"
DESCRIPTION = "The Zabbix proxy compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-proxy-postgresql-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "23671a849bc21d7428954c3f9e36fc9b1c50b1e79d3791d21e62e22eb135def229d4c45488eec818d4e511ed87aa4f2a2e3fac013c3237c8a478f3984151874d"

RPROVIDES:${PN} += "zabbix zabbix-proxy-postgresql zabbix-proxy-postgresql(aarch-64) zabbix_proxy_binary"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenIPMI.so.0()(64bit) libOpenIPMIposix.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libevent-2.1.so.7()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnetsnmp.so.40()(64bit) libodbc.so.2()(64bit) libpcre.so.1()(64bit) libpq.so.5()(64bit) libssh2.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) postgresql update-alternatives zabbix-proxy"

inherit rpm
