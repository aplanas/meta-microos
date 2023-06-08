SUMMARY = "New Zealand datum grids for Proj"
DESCRIPTION = "New Zealand datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-nz-9.2.0-1.3.noarch.rpm"
RPM_HASH = "8a8b1310b4dd09ef7183f0279fb89f2b6623ed629d8965412ee2f3fea9369227a3025709e8e61663e44db121a46b63a91167000e6bbd19f961150cc1870fc670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nz"
RDEPENDS:${PN} += ""

inherit rpm
