SUMMARY = "Flush left equations with dotted leaders to the numbers"
DESCRIPTION = "The package provides a different format for typesetting \
equations, one reportedly used in 'old style Britsh books': \
equations aligned on the left, with dots on the right leading \
to the equation number. In default of an equation number, the \
package operates much like the fleqn class option (no leaders)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn17195"

RPM_NAME = "texlive-dotseqn-2023.201.1.1svn17195-52.1.noarch.rpm"
RPM_HASH = "b81bc95fb189f1c2a12c16038886ac1619403b104db3999d4461c714c7c0709613affa6081abab5647f6d3b45628e5fc81cfb6938fd55b4e1a773b4ed05119a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dotseqn.sty) texlive-dotseqn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
