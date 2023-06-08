SUMMARY = "Documentation files for python-PyQRCode"
DESCRIPTION = "HTML Documentation for python-PyQRCode."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python-PyQRCode-doc-1.3.6-3.11.noarch.rpm"
RPM_HASH = "2f8f7f94e6a97f42a0d782dc1079aaebbb5f2232e4c59ebd0d12b7df85ebbef0aa3797888c5655b9419a75527b0273fe4ea9de75e20d1674b87cc4f0775bdc16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-PyQRCode-doc"
RDEPENDS:${PN} += ""

inherit rpm
