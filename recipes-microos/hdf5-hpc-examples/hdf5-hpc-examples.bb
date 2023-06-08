SUMMARY = "Dependency package for hdf5_1_12_2-hpc-examples"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-hpc-examples provides the dependency to get binary package hdf5_1_12_2-hpc-examples. \
When this package gets updated it installs the latest version of hdf5_1_12_2-hpc-examples."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-hpc-examples-1.12.2-5.2.noarch.rpm"
RPM_HASH = "5b92da48e67b7e542961be335a66ff426c1fc68abb28aced6876779c1978541a0718733486be4c885558daede447b58d42ea6d1cdfd34fcf8646ef9d73a72aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-hpc-examples"
RDEPENDS:${PN} += "hdf5_1_12_2-hpc-examples"

inherit rpm
