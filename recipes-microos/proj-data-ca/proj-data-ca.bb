SUMMARY = "Canada datum grids for Proj"
DESCRIPTION = "Canada datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-ca-9.2.0-1.3.noarch.rpm"
RPM_HASH = "c6331c2cdd641421b620bc0879914d0679c19635175a7329ee271eaca881d1b71371884bfbf2360c2c2e45996baa340ae62bde377c060c9a5a1c1abaaa3a441d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ca"
RDEPENDS:${PN} += ""

inherit rpm
