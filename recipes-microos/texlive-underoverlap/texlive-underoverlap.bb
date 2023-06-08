SUMMARY = "Position decorations over and under expressions"
DESCRIPTION = "The package overcomes TeX's inherent limitations in commands \
that place decorations (such as braces) at arbirary positions \
over and under expressions, overlapping as necessary."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1_r1svn29019"

RPM_NAME = "texlive-underoverlap-2023.201.0.0.0.1_r1svn29019-53.1.noarch.rpm"
RPM_HASH = "5f5b3e0943babc91cd7f439cf914242d363db39b8f60ab576eaa2533d92d1231c7ad992199ccf72d5ca3eb1e851a67bf34e9dafed163c35a1defdc32857be7ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(underoverlap.sty) texlive-underoverlap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(mathtools.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
