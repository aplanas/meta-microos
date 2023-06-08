SUMMARY = "OpenLDAP Meta Back-End"
DESCRIPTION = "The OpenLDAP Meta back-end is able to perform basic LDAP proxying with \
respect to a set of remote LDAP servers. The information contained in \
these servers can be presented as belonging to a single Directory \
Information Tree (DIT)."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-meta-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "9914ea97d1485db999d24d495038d56d8d32c294518e4daae41bf333791d86855f77c616f62d574606d0394f58873444216b7a474e75a3606831f8166a14c46c"

RPROVIDES:${PN} += "openldap2-back-meta openldap2-back-meta(aarch-64) openldap2:/usr/share/man/man5/slapd-meta.5.gz"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) openldap2"

inherit rpm
