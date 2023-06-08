SUMMARY = "Documentation for texlive-optional"
DESCRIPTION = "This package includes the documentation for texlive-optional"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2bsvn18131"

RPM_NAME = "texlive-optional-doc-2023.201.2.2bsvn18131-54.1.noarch.rpm"
RPM_HASH = "8e43cb7cfc03bd0f3757eb57b454a79354a9b12b352e4b9cd208b02d50333129501b90980ef8952db509d18cade3a65ae24f685969345c1e042d2e58299759ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optional-doc"
RDEPENDS:${PN} += ""

inherit rpm
