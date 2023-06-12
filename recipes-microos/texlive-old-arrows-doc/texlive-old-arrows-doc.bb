SUMMARY = "Documentation for texlive-old-arrows"
DESCRIPTION = "This package includes the documentation for texlive-old-arrows"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn42872"

RPM_NAME = "texlive-old-arrows-doc-2023.201.2.0svn42872-54.1.noarch.rpm"
RPM_HASH = "a21bb6230f173c72c62366142485ac96a3511c7217023f8da98354e6b359b691a189cb27f7dce5ba7036f24fcf33b2b3a2f0f4bd459af6ce516b1d71d2975b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-old-arrows-doc:it) \
texlive-old-arrows-doc"
RDEPENDS:${PN} += ""

inherit rpm
