SUMMARY = "Libraries, Header Files and Documentation for OpenLDAP"
DESCRIPTION = "This package provides the OpenLDAP libraries, header files, and \
documentation."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-devel-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "4891f4a4616fad7c1f71599886d4cd0826a0cb2daaab208896e8a856da3c8d5c80e6763c4a2eb11c8e4c00e376b32996863e0d7f60557641fa29314ca3d576e0"

RPROVIDES:${PN} += "openldap2-devel openldap2-devel(aarch-64) pkgconfig(lber) pkgconfig(ldap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libldap2 pkgconfig(lber)"

inherit rpm
