SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi4-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi4-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "e4b05203636d76509d4f50278e9544ed3be6dbeba4c682a97e8eac06569bf910e1b722b5b09e3e713e385e2cf250eaa4bd4228677d530e4bf8e5bd32b02cdfbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi4-hpc"
RDEPENDS:${PN} += "netcdf_4_9_2-gnu-openmpi4-hpc"

inherit rpm
