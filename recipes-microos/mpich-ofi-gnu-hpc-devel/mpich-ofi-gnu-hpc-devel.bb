SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-devel provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "c703078e0c785649eeaddd305740a0b1c62bf8e1b8df0a443207829a0e7057dc4b3771acffc146df526f3a9f02cb4f551d158d12be684e23baf63d9a5a912ee3"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-devel \
mpich-ofi-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "mpich-ofi_4_0_2-gnu-hpc-devel"

inherit rpm
