SUMMARY = "Documentation for qt6-webengine in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webengine in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-webengine-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3aa015786f3dfced3437e60c5ce5b56f44b92386065827618178088b4808be0575eb9c60683c215749d40c62342d312ee37fb258639c147aef30bb2808383ab7"

RPROVIDES:${PN} += "qt6-webengine-docs-qch qt6-webengine-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
