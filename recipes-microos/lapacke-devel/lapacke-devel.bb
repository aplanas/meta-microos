SUMMARY = "LAPACKE development files"
DESCRIPTION = "LAPACKE headers and development files."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "lapacke-devel-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "c3daaf82849b2d5d6c78596b31a621e3ee4717219cb6a4b11b317afddd593baa7095ecacdf02f5893b626473150f855b79206197b4a250e35378214a218d7a9f"

RPROVIDES:${PN} += "lapacke lapacke-devel lapacke-devel(aarch-64)"
RDEPENDS:${PN} += "liblapacke3"

inherit rpm
