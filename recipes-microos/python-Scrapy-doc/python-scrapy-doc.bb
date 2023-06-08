SUMMARY = "Documentation for python-Scrapy"
DESCRIPTION = "Provides documentation for python-Scrapy."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python-Scrapy-doc-2.7.1-1.5.noarch.rpm"
RPM_HASH = "6af450d607141180492c966e618cf224da8870d3cc2b3f2c5fd990efb2fc8b067ff9345b3490a6eedb274360ebbd3e46dc90d7c41fd3de0008303239420ad514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Scrapy-doc"
RDEPENDS:${PN} += ""

inherit rpm
