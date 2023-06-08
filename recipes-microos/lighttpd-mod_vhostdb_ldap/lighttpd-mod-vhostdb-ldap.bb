SUMMARY = "LDAP based virtual hosts module for Lighttpd"
DESCRIPTION = "With LDAP based vhosting you can put the information where to look for \
the document-root of a given host into an LDAP database."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_vhostdb_ldap-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "4c0eab5bad6ac806c46b306ea38109ef1d66f00393f973f33b5662ac2b9a7366e614f2799fec04dd59fad7ab98f556c778b2d20e6d4d4aeb7d8966da60f649b5"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_ldap lighttpd-mod_vhostdb_ldap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) lighttpd"

inherit rpm
