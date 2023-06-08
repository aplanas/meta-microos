SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-ftp-20230509-1651.1.aarch64.rpm"
RPM_HASH = "44c063847c6b6395e37a5095597d7871c548e392d064761db0d194a67df72018f99ea90a4c9095edbb2596f1bb4fc201bb76b9421fe5636d19e5bd7d6358d8ce"

RPROVIDES:${PN} += "flavor(ftp) openSUSE-release-ftp openSUSE-release-ftp(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
