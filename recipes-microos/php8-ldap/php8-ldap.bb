SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-ldap-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "6dda508faa57e283124ec3fa5fa1c0d5b79bd135fc7f3a941c4f3347699183df7f0602cced51afc91d211327dcd5c06d86a6ae3e06b05c05333a1786bec64ad6"

RPROVIDES:${PN} += "config(php8-ldap) php-ldap php8-ldap php8-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) php"

inherit rpm
