SUMMARY = "LDAP authentication in lighttpd"
DESCRIPTION = "A module to provide LDAP authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_authn_ldap-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "cee88599dc93c5dd36678e42ac61563ec70f41bb150caa97e96565485d532e909fbef53c5d07954db06dc359364ca72b0991f03d3fdf8c49e08a0686b41806cd"

RPROVIDES:${PN} += "lighttpd-mod_authn_ldap lighttpd-mod_authn_ldap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) lighttpd"

inherit rpm
