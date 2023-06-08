SUMMARY = "Documentation for texlive-biblatex-opcit-booktitle"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-opcit-booktitle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.0svn48983"

RPM_NAME = "texlive-biblatex-opcit-booktitle-doc-2023.201.1.9.0svn48983-53.1.noarch.rpm"
RPM_HASH = "0dca0aa238d7fc9253e804b957beeea731472d7c79f0b36df833e041acac3121f511a71c8900eb9c0aa054b223f9c93bfddd815cde78e8d3e7ee5ebf87e26897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-opcit-booktitle-doc"
RDEPENDS:${PN} += ""

inherit rpm
