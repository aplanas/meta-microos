SUMMARY = "SGML parser tools (development package)"
DESCRIPTION = "Libraries and includes to compile applications that use the SGML parser \
tools (package 'opensp')."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "opensp-devel-1.5.2-202.1.aarch64.rpm"
RPM_HASH = "937784f276abacee5bfb34fc557645611ee3c87afb9ad572326472c60b11cc88410ef34e06f3cd41499fdafe4ad8ef530847535f1ecbac59c1dfaa27c9c96f34"

RPROVIDES:${PN} += "OpenSP-devel opensp-devel opensp-devel(aarch-64) sp-devel"
RDEPENDS:${PN} += "glibc-devel libstdc++-devel opensp"

inherit rpm
