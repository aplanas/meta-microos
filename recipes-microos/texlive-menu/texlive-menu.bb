SUMMARY = "Typesetting menus"
DESCRIPTION = "The package defines command \\menu which assists typesetting of \
a path through a program's menu."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.994svn15878"

RPM_NAME = "texlive-menu-2023.201.0.0.994svn15878-54.1.noarch.rpm"
RPM_HASH = "259914b3eaa17b92d6e8bc70fc343d62312e6b11714f3b77686e81d9b6db2dacb94c4fc7a5e178bcaefddfc8b067157fae0e2db5e3037c8dcb6b59e6c2037f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(menu.sty) texlive-menu"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(bbding.sty) tex(color.sty) tex(fancybox.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
