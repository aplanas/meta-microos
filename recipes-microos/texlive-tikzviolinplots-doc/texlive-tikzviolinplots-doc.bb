SUMMARY = "Documentation for texlive-tikzviolinplots"
DESCRIPTION = "This package includes the documentation for texlive-tikzviolinplots"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.1svn65687"

RPM_NAME = "texlive-tikzviolinplots-doc-2023.201.0.0.7.1svn65687-52.1.noarch.rpm"
RPM_HASH = "2f3d8bc4596cba1366756f6ab429db8c12dfa6e8202cb3936a347a006b507968e29bbd6cd2497501ac41a096a0052b1514f376a5fd714cd925f57f34e5d60719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzviolinplots-doc"
RDEPENDS:${PN} += ""

inherit rpm
