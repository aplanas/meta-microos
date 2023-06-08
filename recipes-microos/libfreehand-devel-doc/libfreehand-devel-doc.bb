SUMMARY = "Documentation for the libfreehand API"
DESCRIPTION = "This package contains documentation for the libfreehand API."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-devel-doc-0.1.2-2.18.noarch.rpm"
RPM_HASH = "b8ad8938e2bc53b613eae3a6522be1de84993416008c2122bd9bcc669291e85c96f542cb7d56d15355f241c1f000b3ded8936ef7543801c3de81ec944f58b131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfreehand-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
