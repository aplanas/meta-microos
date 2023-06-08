SUMMARY = "System files for the Zabbix server"
DESCRIPTION = "The Zabbix server component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-server-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "c59e05f42ebf3d27c9e263dbe06bd54acb62eda07c17b2a13e4a06bedc012f77963c4cfc14e45f25bf65e0b9903686b483a1faf5e2ad8db85783696912acb893"

RPROVIDES:${PN} += "config(zabbix-server) zabbix-server zabbix-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup fping ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcre.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) logrotate shadow update-alternatives zabbix_server_binary"

inherit rpm
