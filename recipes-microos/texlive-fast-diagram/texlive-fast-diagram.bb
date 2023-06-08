SUMMARY = "Easy generation of FAST diagrams"
DESCRIPTION = "The package provides simple means of producing FAST diagrams, \
using TikZ/pgf tools. FAST diagrams are useful for functional \
analysis techniques in design methods."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn29264"

RPM_NAME = "texlive-fast-diagram-2023.201.1.1svn29264-52.1.noarch.rpm"
RPM_HASH = "597dcb9fdfc78a12f6d77fdd4d1a1ead27762a04aff923be48914732d49c43ad531cd43edaba28c19b84d5781c759d6635a4e6caba8c1601edcd40fd7b7b2d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fast-diagram.sty) texlive-fast-diagram"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(relsize.sty) tex(tikz.sty) tex(xargs.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
