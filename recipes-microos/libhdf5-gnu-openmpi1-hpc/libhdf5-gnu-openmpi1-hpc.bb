SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "791238cc82d7c7661a89a176c343908a3130083d2345cbfb4e4e5e5cf1d2faafa93089fe3cece9e8303410fcaf50581cc793f4ce053d9232e564c029d8289798"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi1-hpc libhdf5-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_1_12_2-gnu-openmpi1-hpc"

inherit rpm
