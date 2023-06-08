SUMMARY = "Documentation for texlive-metauml"
DESCRIPTION = "This package includes the documentation for texlive-metauml"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.6svn49923"

RPM_NAME = "texlive-metauml-doc-2023.201.0.0.2.6svn49923-54.1.noarch.rpm"
RPM_HASH = "95581dd5cb205529a9c0f6d5e77d41bbec8e20c21337b819da19395758326982b44ae07cbad894ff0482137c508c19690d13a682fb9fc77991a77bf587a2458f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metauml-doc"
RDEPENDS:${PN} += ""

inherit rpm
