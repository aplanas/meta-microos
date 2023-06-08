SUMMARY = "Documentation for texlive-turkmen"
DESCRIPTION = "This package includes the documentation for texlive-turkmen"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17748"

RPM_NAME = "texlive-turkmen-doc-2023.201.0.0.2svn17748-52.1.noarch.rpm"
RPM_HASH = "8f97d3faccc33f30807d0196225e5635b632ad9e2129f6bdc5f871eacc01b9efc23c061b69d944ec2294a9c7e723f521064cb0922578c5b51e5fbf4b0fb9d6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turkmen-doc"
RDEPENDS:${PN} += ""

inherit rpm
