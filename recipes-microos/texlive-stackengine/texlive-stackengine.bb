SUMMARY = "Highly customised stacking of objects, insets, baseline changes, etcetera"
DESCRIPTION = "The package provides a versatile way to stack objects \
vertically in a variety of customizable ways. A number of \
useful macros are provided, all of which make use of the \
stackengine core."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.11svn60019"

RPM_NAME = "texlive-stackengine-2023.201.4.11svn60019-57.1.noarch.rpm"
RPM_HASH = "2a33d7fbd42f8171cd248447c59980cd801547096bd513293a3cd5993bb4ada53a96b9f92d581887f10407fa539167539f6568f2c71ba48c8c7b3fe60fc8c87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(stackengine.sty) texlive-stackengine"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(etoolbox.sty) tex(listofitems.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-listofitems texlive-scripts texlive-scripts-bin"

inherit rpm
