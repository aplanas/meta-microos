SUMMARY = "Local resource monitor agent for Zabbix"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-agent-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "8781beb3fd37a784bb0a749ae4f40b2210de5619461e6832479648af78328438da330085cba8276aea3efa9e974a22067cb1cc8a1ef250f1a20d0193984cc52d"

RPROVIDES:${PN} += "config(zabbix-agent) zabbix-agent zabbix-agent(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libpcre.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) logrotate shadow"

inherit rpm
