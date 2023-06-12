SUMMARY = "Documentation for qt6-datavis3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "761079aedbe09621684e58537ad12ba9cf0d118082b30a777832555fb07d3d50cdd364e3150630fbd48af04d88c58df9610ee05bf32b932699ab2841fd964c95"

RPROVIDES:${PN} += "qt6-datavis3d-docs-qch qt6-datavis3d-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
