SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-devel"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-devel provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-devel-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "b3c620f79cb5d296bf14aab35aea0a1bd0ee3064ae2f6e8ccf389405d1f3c4acf6e74511be669a0ae003379533de652186130a9445175ee5d25b0630959c00d3"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-devel mvapich2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "mvapich2_2_3_7-gnu-hpc-devel"

inherit rpm
