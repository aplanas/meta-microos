SUMMARY = "Test a LDAP server"
DESCRIPTION = "Monitor access to a Lightweight Directory Access Protocol (LDAP) server. \
 \
This package includes the 'check_ldap' and 'check_ldaps' plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ldap-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "276c98fcd0b8182bc81b3ebdd1339ec611071b38079d4a62aae7e0dee8569f5ef3c06a00839856af2e4670d6af289a80cc77c05b5470480f88d5d56c1ded43e3"

RPROVIDES:${PN} += "monitoring-plugins-ldap \
monitoring-plugins-ldap(aarch-64) \
nagios-plugins-ldap"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
