SUMMARY = "Collection of data files for use by lscsoft-glue"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database. \
 \
This package provides a common set of data files for lscsoft-glue."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "lscsoft-glue-data-3.0.1-1.4.aarch64.rpm"
RPM_HASH = "f21d5efe28367b0d3555b3ececde4b1f8e8256199f876d230db1cc2243cfd42fa670e653139de2d12d287650606d1b6fae90e366f61e7bf08ec0989580d0e762"

RPROVIDES:${PN} += "lscsoft-glue-data lscsoft-glue-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
