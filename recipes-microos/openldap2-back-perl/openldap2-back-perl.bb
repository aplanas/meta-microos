SUMMARY = "OpenLDAP Perl Back-End"
DESCRIPTION = "The OpenLDAP Perl back-end allows you to execute Perl code specific to \
different LDAP operations."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-perl-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "adae8b6b6d41e090abd63af376f2d6f3da2112cbe4c92e7a7cbdc748a20353f147048e45e1074cf0866c99a5bf86714e8ee6b863dfa55560422a580e9be4a0d8"

RPROVIDES:${PN} += "openldap2-back-perl openldap2-back-perl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libperl.so()(64bit) openldap2 perl"

inherit rpm
