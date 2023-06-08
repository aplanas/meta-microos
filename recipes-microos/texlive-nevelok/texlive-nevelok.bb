SUMMARY = "LaTeX package for automatic definite articles for Hungarian"
DESCRIPTION = "LaTeX package for automatic definite articles for Hungarian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn39029"

RPM_NAME = "texlive-nevelok-2023.201.1.03svn39029-54.1.noarch.rpm"
RPM_HASH = "8a888db51a65577488181d8780113e2295d49aec8af64b65e202fddc9947c75f366533b0398f9cb7c1a89b5cf73cba44e6597d7b6ba73d1718ed6289ef2b3fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nevelok.sty) texlive-nevelok"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
