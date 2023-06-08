SUMMARY = "Dependency package for pnetcdf_1_12_3-hpc-doc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-hpc-doc provides the dependency to get binary package pnetcdf_1_12_3-hpc-doc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-hpc-doc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "242f25ca1889664fe3d4f24aa6a8ba817deffe7c31e4af92aa562aa7dbe97b5ea140a54ce67085765546c6809c2566d0fb390450cc9fc524ad504ae30bf5179a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-hpc-doc"
RDEPENDS:${PN} += "pnetcdf_1_12_3-hpc-doc"

inherit rpm
