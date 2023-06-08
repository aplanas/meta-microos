SUMMARY = "Postfix LDAP map support"
DESCRIPTION = "This provides support for LDAP maps in Postfix. If you plan to use LDAP \
maps with Postfix, you need this."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-ldap-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "458e763c7ea6a51e822ff7eeef9cbee1db3e81fc786dc3bdc092ea8edc4f8dfbe0e293ee017e723bc9206cfff5b4b68c1808280bcc09a018354796962aa29e00"

RPROVIDES:${PN} += "config(postfix-ldap) postfix-ldap postfix-ldap(aarch-64) postfix:/usr/lib/postfix/postfix-ldap.so"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) postfix"

inherit rpm
