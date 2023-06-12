SUMMARY = "Documentation for texlive-pagelayout"
DESCRIPTION = "This package includes the documentation for texlive-pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn66392"

RPM_NAME = "texlive-pagelayout-doc-2023.201.1.0.4svn66392-51.1.noarch.rpm"
RPM_HASH = "4b5d5e7c3ee7a04cb3519550494410ee1d14a2288bf94ccae6b2847004e2bbaa04780a426b87fc7009e306a39b2d2ecb14fbbbe6c6d568e476f9f9a638b4a3db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pagelayoutapi.1) \
man(textestvis.1) \
texlive-pagelayout-doc"
RDEPENDS:${PN} += ""

inherit rpm
