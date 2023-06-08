SUMMARY = "Documentation for texlive-bib2gls"
DESCRIPTION = "This package includes the documentation for texlive-bib2gls"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.2svn65104"

RPM_NAME = "texlive-bib2gls-doc-2023.201.3.2svn65104-53.1.noarch.rpm"
RPM_HASH = "668af11436c358d13d9b0ca069e45903eaad9f04b645d19f479880edd0e7ab7484e2ca6363e1474f521a48473ec17afc1db942af12e15a0f7aad34c18cfba140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(bib2gls.1) man(convertgls2bib.1) texlive-bib2gls-doc"
RDEPENDS:${PN} += ""

inherit rpm
