SUMMARY = "Documentation for texlive-baskervaldx"
DESCRIPTION = "This package includes the documentation for texlive-baskervaldx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.076svn57080"

RPM_NAME = "texlive-baskervaldx-doc-2023.201.1.076svn57080-53.1.noarch.rpm"
RPM_HASH = "5fd9f48676d69cd636b70af968898315f8bc36a697c7499984a4858b079665cefbe4bd1f3d4ebcbde2913c640e6982511754f57451c35cc23a2ed042278432cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervaldx-doc"
RDEPENDS:${PN} += ""

inherit rpm
