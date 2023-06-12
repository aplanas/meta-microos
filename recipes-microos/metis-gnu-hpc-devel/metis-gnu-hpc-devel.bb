SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc-devel"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc-devel provides the dependency to get binary package metis_5_1_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-devel-5.1.0-9.11.noarch.rpm"
RPM_HASH = "23d60596f121a7aec451cc56c2b0915ce214b4eed17398dbd3487cb03a4be738d7f429fae618787b99581ffc0be46f3a2316bcd5c54b950b3bbacb876a7a9dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
metis_5_1_0-gnu-hpc-devel"

inherit rpm
