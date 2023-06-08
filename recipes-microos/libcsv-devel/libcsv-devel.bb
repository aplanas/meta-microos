SUMMARY = "Development files for libcsv"
DESCRIPTION = "This package includes development files for libcsv."
LICENSE = "LGPL-2.1+"

PV = "3.0.3"

RPM_NAME = "libcsv-devel-3.0.3-2.24.aarch64.rpm"
RPM_HASH = "a837aa060ee68ce269327536f3b696be21e32c790f04f980ff0f6331043769457f3f131f79f4f534a6573d6983730bdc878183e1edff5d0c7de2527d40a5d082"

RPROVIDES:${PN} += "libcsv-devel libcsv-devel(aarch-64)"
RDEPENDS:${PN} += "libcsv3"

inherit rpm
