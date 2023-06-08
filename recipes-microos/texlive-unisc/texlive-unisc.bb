SUMMARY = "Unicode small caps with Lua/XeLaTeX"
DESCRIPTION = "LaTeX produces small caps with \\textsc{text} or {\\scshape \
text}. Neither of these commands produce small caps in Unicode. \
If the output text is copied and pasted somewhere it shows the \
same characters as used in the input. This package aims to \
internally convert all the characters provided to the commands \
mentioned above. It assumes that the file using this package is \
compiled with Lua/XeLaTeX and a good Unicode font which has the \
small caps characters, e.g., Charis SIL."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn63178"

RPM_NAME = "texlive-unisc-2023.201.0.0.2svn63178-53.1.noarch.rpm"
RPM_HASH = "cd2142ea7fec4dc8844ef304311a65cac889b3b247805bfecaa7b777aa009384e55ad7e479f62cbb1eeefec1480f66b05d5f187e9d78a6dfde96e425c3790229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unisc.sty) texlive-unisc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgfparser.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
