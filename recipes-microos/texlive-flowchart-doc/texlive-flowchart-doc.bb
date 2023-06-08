SUMMARY = "Documentation for texlive-flowchart"
DESCRIPTION = "This package includes the documentation for texlive-flowchart"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3svn36572"

RPM_NAME = "texlive-flowchart-doc-2023.201.3.3svn36572-52.1.noarch.rpm"
RPM_HASH = "b1f7ec005a0bdfc24e2755f05ed9e8ab62035f78e127fdcf441ad729b114a7e0ccbc4b6f650a5b297523dab3e86ad9d5c314a62b2039514ce01a12b18a59d887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flowchart-doc"
RDEPENDS:${PN} += ""

inherit rpm
