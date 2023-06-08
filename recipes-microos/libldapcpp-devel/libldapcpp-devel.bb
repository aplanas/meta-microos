SUMMARY = "C++ wrapper around openLDAP API"
DESCRIPTION = "This package contains files needed for development with the LDAP C++ \
library."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldapcpp-devel-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "3f6cefa37b6576babf8afa87bfe29a562d943f8af8d6a666272243d040f174d5b42d5359a5d500778db18ed64cf2b8a3b0e887daa16696bedac84f45b96aee16"

RPROVIDES:${PN} += "libldapcpp-devel libldapcpp-devel(aarch-64)"
RDEPENDS:${PN} += "libldapcpp0 openldap2-devel"

inherit rpm
