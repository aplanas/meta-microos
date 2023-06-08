SUMMARY = "Documentation for texlive-lfb"
DESCRIPTION = "This package includes the documentation for texlive-lfb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-lfb-doc-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "e6d71797a6c2715547b5a4c55d1971ceb00f70ef8c5490ff89580d500003ee2b4eeb13c66bd995709c6704749a9248a84f5d205bcc436bd870d34a9046191557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-lfb-doc:el) texlive-lfb-doc"
RDEPENDS:${PN} += ""

inherit rpm
