SUMMARY = "Documentation for texlive-codehigh"
DESCRIPTION = "This package includes the documentation for texlive-codehigh"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023asvn65787"

RPM_NAME = "texlive-codehigh-doc-2023.201.2023asvn65787-53.1.noarch.rpm"
RPM_HASH = "000b9952d6115fdb61ef0d1c103c876dca01866e1633d7d9f4a7372a82a8cbaaff2fd17a49d9694798bf929946aa98ff6339a4bfd263b3cacb535050935ed7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codehigh-doc"
RDEPENDS:${PN} += ""

inherit rpm
