SUMMARY = "OpenLDAP client utilities"
DESCRIPTION = "OpenLDAP client utilities such as ldapadd, ldapsearch, ldapmodify."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-client-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "4d8890b5f86fa247469b8a6e69283f15b988d6e2f3432a61faae61da0caff1bbe80de502264cd40cb577909b4e3487afe1ff41a0cd3623e824a8311d3b7d268b"

RPROVIDES:${PN} += "openldap2-client openldap2-client(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libldap2 libsasl2.so.3()(64bit)"

inherit rpm
