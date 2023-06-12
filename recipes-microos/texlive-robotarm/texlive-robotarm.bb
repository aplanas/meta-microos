SUMMARY = "TikZ powered LaTeX package to draw parameterized 2D robot arms"
DESCRIPTION = "This LaTeX package uses TikZ to draw parameterized 2D robot \
arms, for example to be used in educational material."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-2023.201.0.0.1svn63116-53.1.noarch.rpm"
RPM_HASH = "2dafa3730f24ea3c9a16a638b6add5c7c08fe4d070337db9ed46c2f8b500fb7bde0b6c4c6e952205d8c13d2dbf120443ea32491b4d5dc9f8fc8629c750b78ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(robotarm.sty) \
texlive-robotarm"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
