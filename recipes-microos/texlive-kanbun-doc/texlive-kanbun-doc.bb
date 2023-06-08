SUMMARY = "Documentation for texlive-kanbun"
DESCRIPTION = "This package includes the documentation for texlive-kanbun"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn62026"

RPM_NAME = "texlive-kanbun-doc-2023.201.1.2svn62026-55.1.noarch.rpm"
RPM_HASH = "b56f1d74d16018b76cc2bfe1a22db4f54a62092e38b5d480739be97a82624ca03a360767902eba2904d19bfc1a2300fa3a77a02d54f3a54c2d219093173c5df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) locale(texlive-kanbun-doc:zh texlive-kanbun-doc"
RDEPENDS:${PN} += ""

inherit rpm
