SUMMARY = "LDAP Module for ProFTPD"
DESCRIPTION = "This is the LDAP Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-ldap-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "fe4a58210f98406b4224b5d1eb45fbdae62c1a1dfac54c6e0191d012dc05c0ac6e26787b95a90da1730ac2328bf4945abeac30b0d92381665bfa734faa5d1af3"

RPROVIDES:${PN} += "proftpd-ldap proftpd-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) proftpd"

inherit rpm
