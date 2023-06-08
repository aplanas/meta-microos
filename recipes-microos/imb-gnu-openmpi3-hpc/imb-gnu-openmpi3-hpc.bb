SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi3-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi3-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi3-hpc-2021.3-1.2.noarch.rpm"
RPM_HASH = "1688225c87581340df357a4962ad8702a70838a07e8f60f44e4336352c42429bc631d48602b2e5aff13785e1c165a9513b8fac80509ed595e72902271a47451e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi3-hpc"
RDEPENDS:${PN} += "/bin/sh imb_2021_3-gnu-openmpi3-hpc"

inherit rpm
