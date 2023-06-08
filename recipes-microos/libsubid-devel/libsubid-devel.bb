SUMMARY = "Development files for libsubid4"
DESCRIPTION = "Development files for libsubid4."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "libsubid-devel-4.13-6.1.aarch64.rpm"
RPM_HASH = "016215d0c8848b1c7e354261f1540892cf37f662e4228047470ba51031feca6e7d3bb5e4662984d904367a7d7574ebdb960b1e2321a7444cae254a190fe7d2f2"

RPROVIDES:${PN} += "libsubid-devel libsubid-devel(aarch-64)"
RDEPENDS:${PN} += "libsubid4"

inherit rpm
