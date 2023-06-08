SUMMARY = "Nordic + Baltic datum grids for Proj"
DESCRIPTION = "Nordic + Baltic datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-eur-9.2.0-1.3.noarch.rpm"
RPM_HASH = "901beeb092905886eb25704cf89f8606208dcf7e78f567eb5de95f5baa105ac1ddb9ceb793e276da78516e8c94da458c2afafe91bebfcc27a545deb52e0d8b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-eur"
RDEPENDS:${PN} += ""

inherit rpm
