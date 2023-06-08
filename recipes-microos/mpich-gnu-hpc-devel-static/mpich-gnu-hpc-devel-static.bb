SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc-devel-static"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-devel-static provides the dependency to get binary package mpich_4_0_2-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-devel-static-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "2afce416775f96e2cbc04e223ea88fce27599014cb5221ff90a8c535020140b074d993918869296237347f12c1dc84d6dfa1da3a5dec36fa89fdfb7b53520808"

RPROVIDES:${PN} += "mpich-gnu-hpc-devel-static mpich-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mpich_4_0_2-gnu-hpc-devel-static"

inherit rpm
