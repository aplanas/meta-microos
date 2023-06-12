SUMMARY = "Documentation for qt6-webengine in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webengine in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d09fbaf785fa86a26d07fb5d2fa878bbbaaffdb13b7525289eb5b33c34d638e208284d3a4bce6a91864508394badf1a995cd1a85ca5a301af4592d997360f8b3"

RPROVIDES:${PN} += "qt6-webengine-docs-qch qt6-webengine-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
