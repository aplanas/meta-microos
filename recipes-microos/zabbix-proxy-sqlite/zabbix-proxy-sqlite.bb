SUMMARY = "Zabbix proxy with SQLite support"
DESCRIPTION = "The Zabbix proxy compiled with SQLite support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-proxy-sqlite-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "2392320ceef63d5845a3290bd2e23f6013f7bba7f43a5deaa1df118c829f5f5b7b9068f7779a63f255d189a085d5e06d7c372a7ed8b8f63746a10a005f898c69"

RPROVIDES:${PN} += "zabbix zabbix-proxy-sqlite zabbix-proxy-sqlite(aarch-64) zabbix_proxy_binary"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenIPMI.so.0()(64bit) libOpenIPMIposix.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libevent-2.1.so.7()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnetsnmp.so.40()(64bit) libodbc.so.2()(64bit) libpcre.so.1()(64bit) libsqlite3.so.0()(64bit) libssh2.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) update-alternatives zabbix-proxy"

inherit rpm
