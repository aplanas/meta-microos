SUMMARY = "Development data files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains generic files needed to create projects that use \
any version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-devel-data-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ef2e33dbe0c603fa7e6c86a8e54a9f561a9027c9b4942ff43f30fd508991b0fb6850e2f2d3ae3bd93fdf0e7c1914267c194a7cdc5f855d74e090dbc063f69087"

RPROVIDES:${PN} += "hdf5-devel-data hdf5-devel-data(aarch-64) rpm_macro(_hdf5_sonum) rpm_macro(_hdf5_version)"
RDEPENDS:${PN} += ""

inherit rpm
