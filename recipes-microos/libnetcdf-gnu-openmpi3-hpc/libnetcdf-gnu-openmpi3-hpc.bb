SUMMARY = "Dependency package for libnetcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package libnetcdf-gnu-openmpi3-hpc provides the dependency to get binary package libnetcdf_4_9_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "libnetcdf-gnu-openmpi3-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "40e124241d4ca8616c1ea8d15d411ec581d944cba669f8e95cb983b45e6258ec397216500ce66b3f304f53ac02a997485dd520f556f91897022c2e6fe71e70f9"

RPROVIDES:${PN} += "libnetcdf-gnu-openmpi3-hpc libnetcdf-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libnetcdf_4_9_2-gnu-openmpi3-hpc"

inherit rpm
