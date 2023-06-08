SUMMARY = "Documentation for Pyramid exceptions logger"
DESCRIPTION = "This package contains documentation for python-peppercorn."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python-peppercorn-doc-0.6-3.14.noarch.rpm"
RPM_HASH = "50db13f39d1bd5fcd77222d35c35bc1fb7fb99696f23213c298baa31a1a85dd77d616daeef0a1232cb5098e96bdbe013eaf181e824b76391ce8b13a060bc8909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-peppercorn-doc"
RDEPENDS:${PN} += ""

inherit rpm
