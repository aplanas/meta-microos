SUMMARY = "Documentation for texlive-match_parens"
DESCRIPTION = "This package includes the documentation for texlive-match_parens"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.43svn36270"

RPM_NAME = "texlive-match_parens-doc-2023.201.1.43svn36270-52.1.noarch.rpm"
RPM_HASH = "5d1a0932cae2435452d84bfb16377fa5309bddd0d85e5c880ff806efdda22eaec26c75d22721e35c85ae9d19e91598f8ecab988578e35859ac69e51d2316aa70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-match_parens-doc"
RDEPENDS:${PN} += ""

inherit rpm
