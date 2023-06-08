SUMMARY = "Documentation for texlive-tikz-karnaugh"
DESCRIPTION = "This package includes the documentation for texlive-tikz-karnaugh"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn62040"

RPM_NAME = "texlive-tikz-karnaugh-doc-2023.201.1.5svn62040-52.1.noarch.rpm"
RPM_HASH = "f76d4e5215902c65d638dd60a18997afed4ed5f9b2b115907f17d3eb7a6ba9884fc7c89963649a3e80114f29a4e5e368a1b35b1017924142cec314265c2aa1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-karnaugh-doc"
RDEPENDS:${PN} += ""

inherit rpm
