SUMMARY = "Local resource monitor agent for Zabbix"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-agent-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "61d526d1f96387b4937d564d009d7ade6af8b8b0d3ebc6eca720eec2ead8ae12d9e51ab6c5fa33f1fcf3617df95b1e2b55bf043eca41bdf17784e301b6f2c919"

RPROVIDES:${PN} += "config(zabbix-agent) \
zabbix-agent \
zabbix-agent(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpcre.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
logrotate \
shadow"

inherit rpm
