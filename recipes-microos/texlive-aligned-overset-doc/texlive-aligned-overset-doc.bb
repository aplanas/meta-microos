SUMMARY = "Documentation for texlive-aligned-overset"
DESCRIPTION = "This package includes the documentation for texlive-aligned-overset"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn47290"

RPM_NAME = "texlive-aligned-overset-doc-2023.201.0.0.1.0svn47290-54.1.noarch.rpm"
RPM_HASH = "d1835984130a7fbfaf1ea98fc63fcf3213472d8d73edb1dc57aa32e5c20d7a010f210d55b28c03e6404fc13b4d4bfa6d6793a2c966948764ffd5a5162e0bfbf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aligned-overset-doc"
RDEPENDS:${PN} += ""

inherit rpm
