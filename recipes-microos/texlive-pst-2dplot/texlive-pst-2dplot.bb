SUMMARY = "A PSTricks package for drawing 2D curves"
DESCRIPTION = "Pst-2dplot is a pstricks package that offers an easy-to-use and \
intuitive tool for plotting 2-d curves. It defines an \
environment with commands similar to MATLAB for plotting."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-pst-2dplot-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "c9395aac1000f644e0705cc3a260372ce03ebe31246da6589d162ab2f60c34bd43dba7c04f64f7439f496ecf640ab6d3b658507e85cc37f8f40ca7bca10b457a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-2dplot.sty) \
texlive-pst-2dplot"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
