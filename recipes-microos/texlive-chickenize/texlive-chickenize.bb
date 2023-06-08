SUMMARY = "Use lua callbacks for 'interesting' textual effects"
DESCRIPTION = "The package allows manipulations of any LuaTeX document (it is \
known to work with Plain LuaTeX and LuaLaTeX). Most of the \
package's functions are merely for fun or educational use, but \
some functions (for example, colorstretch for visualising the \
badness and font expansion of each line, and letterspaceadjust \
doing what its name says) could be useful in a 'normal' LuaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn57325"

RPM_NAME = "texlive-chickenize-2023.201.0.0.3svn57325-53.1.noarch.rpm"
RPM_HASH = "578180c25cf63a37e7bf747f191fad61dcdf39cacca3f7a4d9e0670706072cae2a2afe73225d777b67b93309e66226b33f9dc8ad89b33a4627d25b47eaa56d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chickenize.sty) tex(chickenize.tex) texlive-chickenize"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
