SUMMARY = "Dependency package for metis_5_1_0-gnu-hpc"
DESCRIPTION = "metis: Serial Graph Partitioning and Fill-reducing Matrix Ordering \
The package metis-gnu-hpc provides the dependency to get binary package metis_5_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of metis_5_1_0-gnu-hpc."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-gnu-hpc-5.1.0-9.11.noarch.rpm"
RPM_HASH = "667e1988039ab567f98ee04411768c6dee29bde2ab4c5282c28497f68f27f61ab1ea4d37577f7231e76b045efa312596b8929b7ef403935f3104ef1a02b5bd85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-gnu-hpc"
RDEPENDS:${PN} += "/bin/sh \
metis_5_1_0-gnu-hpc"

inherit rpm
