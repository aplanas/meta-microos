SUMMARY = "Repeating of math operator at the broken line and the new line in inline equations"
DESCRIPTION = "Repeating of math operators at the broken line and the new line \
in inline equations is used in Cyrillic mathematical typography \
(Russian for example), but unfortunately LaTeX does not provide \
such an option. This package solves the problem by extending \
ideas described in M. I. Grinchuk 'TeX and Russian Traditions \
of Typesetting', TUGboat 17(4) (1996) 385 and supports most of \
LaTeX mathematical packages. See the documentation for details."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-2023.201.1.1.1svn57173-53.1.noarch.rpm"
RPM_HASH = "8cd1bc6607c3d71d3a6f40b26da9299cb113123d601b4f7687c461fb27b75c1f1cad0470eb2835ac41c3feb2aee7d7b35cb16c3058e49ec202691456be3c10b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rmathbr.sty) \
texlive-rmathbr"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(ifetex.sty) \
tex(ifluatex.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
