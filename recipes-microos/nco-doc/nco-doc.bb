SUMMARY = "Documentation for nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains the documentation for nco."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "nco-doc-5.1.4-1.4.noarch.rpm"
RPM_HASH = "f596e1e750bbf6ff22d07280972df09e096704c999b2b49277b30d8b44e785bbe0facf54c7cd6de308e70ecab7d0ca386b23d475f32c9319833a08c63e23e8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nco-doc"
RDEPENDS:${PN} += ""

inherit rpm
