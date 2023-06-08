SUMMARY = "Development files for libvc"
DESCRIPTION = "Development files for libvc."
LICENSE = "LGPL-2.1-only"

PV = "012"

RPM_NAME = "libvc-devel-012-1.3.aarch64.rpm"
RPM_HASH = "aea91850a753c7570e282e543dc413357784f079494614a24fc927d648284cf16788b21c7e691b79348a4743aea56c69c1f071b0185a605627ecee8c2250826c"

RPROVIDES:${PN} += "libvc-devel libvc-devel(aarch-64)"
RDEPENDS:${PN} += "libvc0"

inherit rpm
