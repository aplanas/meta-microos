SUMMARY = "Documentation for texlive-kpfonts"
DESCRIPTION = "This package includes the documentation for texlive-kpfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.35svn65583"

RPM_NAME = "texlive-kpfonts-doc-2023.201.3.35svn65583-55.1.noarch.rpm"
RPM_HASH = "024d7d259101d3c8805f48f0123a0ee72a1545ac4610b50a61f29ca54597ec8a82fea72d35a584d5c8f93b6f2b991fb1c48a9ed27d1d1335935441f02f6b464e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-kpfonts-doc:en) \
texlive-kpfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
