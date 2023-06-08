SUMMARY = "Vietnamese translation of AMSLaTeX documentation"
DESCRIPTION = "This is a Vietnamese translation of amsldoc, the users' guide \
to amsmath."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn21855"

RPM_NAME = "texlive-amsldoc-vn-2023.201.2.0svn21855-54.1.noarch.rpm"
RPM_HASH = "e0750ef0f22b636263d802a89fe426af5458563fc6d9b2f1f7eaa08ace704b2ef7ae1c3ef613c404a404bbcb9c3a0903d06933254cf4fedcf918e7783c4db304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsldoc-vn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
