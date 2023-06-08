SUMMARY = "A wrapper for using the truncate package with LuaLaTeX"
DESCRIPTION = "This package provides a wrapper for the truncate package, thus \
fixing issues related to LuaTeX's hyphenation algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48469"

RPM_NAME = "texlive-lualatex-truncate-2023.201.1.1svn48469-52.1.noarch.rpm"
RPM_HASH = "1841c1bf148e1529768a326cf304afec0c47611079fa94bc40d552032f1ff30f369c019179b7ce2c573044409db21ef42d52794153a549e133539d1ad1035c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lualatex-truncate.sty) texlive-lualatex-truncate"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) tex(letltxmacro.sty) tex(truncate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
