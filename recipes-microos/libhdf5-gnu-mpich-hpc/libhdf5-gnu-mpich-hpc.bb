SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-mpich-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5cd4abc58a2cbf8bb72c864608c5e347ee923ef2c2c2493d885643014e1d6be206ce840b9431f0a921afb90c928b0e7119dbd8a85b583644f3f60d008a2304fc"

RPROVIDES:${PN} += "libhdf5-gnu-mpich-hpc libhdf5-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_1_12_2-gnu-mpich-hpc"

inherit rpm
