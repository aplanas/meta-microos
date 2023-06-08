SUMMARY = "Draw objects for Chemistry laboratories"
DESCRIPTION = "Pst-labo is a PSTricks related package for drawing basic and \
complex chemical objects. The documentation of the package is \
illuminated with plenty of illustrations together with their \
source code, making it an easy read."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.04svn39077"

RPM_NAME = "texlive-pst-labo-2023.201.2.04svn39077-52.1.noarch.rpm"
RPM_HASH = "305988221b22c2e594ef0158aa39b15cf44c81ac541bbb384c2dd1234d43aee6fcd82d094f63ce7739a5e207211015aa929308efd47db32bdd004e31a5d9e4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-labo.sty) tex(pst-labo.tex) tex(pst-laboObj.tex) texlive-pst-labo"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
