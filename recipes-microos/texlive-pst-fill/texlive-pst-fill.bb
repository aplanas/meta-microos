SUMMARY = "Fill or tile areas with PSTricks"
DESCRIPTION = "Pst-fill is a PSTricks-based package for filling and tiling \
areas or characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn60671"

RPM_NAME = "texlive-pst-fill-2023.201.1.02svn60671-52.1.noarch.rpm"
RPM_HASH = "97f5a14bc19174408142c8aa0a93e8afbb9c81b42b7f6e22d06dac202b13fbe99d4fd35d9fad27904ac8a3ad932ffb8abe7dd1162a372d66a19d34205176b5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-fill.sty) tex(pst-fill.tex) texlive-pst-fill"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
