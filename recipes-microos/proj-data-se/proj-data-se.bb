SUMMARY = "Sweden datum grids for Proj"
DESCRIPTION = "Sweden datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-se-9.2.0-1.3.noarch.rpm"
RPM_HASH = "2ee991476e7708ae49c9772c74b2a3956cc071002a70cf886cca4cd12ee12bb5a868e67ca827b6dba0ce401dc0d0c9593cace0761f4a0d46875735cd1e3c8dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-se"
RDEPENDS:${PN} += ""

inherit rpm
