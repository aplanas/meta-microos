SUMMARY = "Run time data for hwloc"
DESCRIPTION = "This package contains the run time data for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-data-2.9.0-2.3.noarch.rpm"
RPM_HASH = "f533f5fa3e06b13dec70f2396fad2752a7ce02689b2bf6f37ad8d3fd739a46cbd684c90d962f25b9174f3ce2778fc856c1c97417c06d3ff9520513a763d4a3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-data"
RDEPENDS:${PN} += ""

inherit rpm
