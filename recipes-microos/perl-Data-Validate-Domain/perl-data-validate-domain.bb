SUMMARY = "Domain and host name validation"
DESCRIPTION = "This module offers a few subroutines for validating domain and host names."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Data-Validate-Domain-0.15-1.9.noarch.rpm"
RPM_HASH = "2a702ce3948dde5293d0e61ddb9f210f085d01e63a46b1598ca76214c4aab608d1aa62b19f5153f0c4fa029a2d3708d290e5e6c442e4280b794820b8e03f549e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Validate::Domain) perl-Data-Validate-Domain"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Net::Domain::TLD)"

inherit rpm
