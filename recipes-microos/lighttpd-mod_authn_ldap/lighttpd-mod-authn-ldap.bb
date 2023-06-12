SUMMARY = "LDAP authentication in lighttpd"
DESCRIPTION = "A module to provide LDAP authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_ldap-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "a5d6109ec621e8e5a031f7ed36ce2c7697eccf21e618519b49f878022352a36599a9a46f55d3cb15aea1fdda949aa758f7da099f1e7dd3135b8ced5981379d56"

RPROVIDES:${PN} += "lighttpd-mod_authn_ldap lighttpd-mod_authn_ldap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) lighttpd"

inherit rpm
