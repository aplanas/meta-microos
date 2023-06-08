SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "a3b82cfb26660dbe3d61fccf9cd3c0e46f648d05f1e27050d43f455894fc9bdab5205dba2f6a2492fbf11c9b9eadb3b551e345b7529b1028e814afa82f252d62"

RPROVIDES:${PN} += "libhdf5_hl-gnu-mvapich2-hpc libhdf5_hl-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_1_12_2-gnu-mvapich2-hpc"

inherit rpm
