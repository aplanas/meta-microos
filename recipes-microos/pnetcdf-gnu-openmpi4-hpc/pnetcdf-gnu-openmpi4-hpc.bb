SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi4-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi4-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi4-hpc-1.12.3-1.2.noarch.rpm"
RPM_HASH = "24fa79210a68e84a49485ac1262380949e8ce8c3b9b11ddb0b26922ccef42034cbdd8184038e8001769a24c9280d909c983e6670e701ed10c0e2704df3341cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi4-hpc"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-openmpi4-hpc"

inherit rpm
