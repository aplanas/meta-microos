SUMMARY = "Documentation for texlive-leaflet"
DESCRIPTION = "This package includes the documentation for texlive-leaflet"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1asvn56878"

RPM_NAME = "texlive-leaflet-doc-2023.201.2.1asvn56878-54.1.noarch.rpm"
RPM_HASH = "dc77aa79ec0898f56b5e4310860b151444e9032abb947a5efa95b81694bebcae74eaedaa4d43bf1709b01d82816dc92fdd1f9fbe1a93f10b78c8ccac68a44d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leaflet-doc"
RDEPENDS:${PN} += ""

inherit rpm
