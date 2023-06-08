SUMMARY = "A simple citation style for Chinese users"
DESCRIPTION = "The package provides a simple and easily extensible \
biblography/citation style for Chinese LaTeX users, using \
BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.6svn64866"

RPM_NAME = "texlive-biblatex-caspervector-2023.201.0.0.3.6svn64866-53.1.noarch.rpm"
RPM_HASH = "7d54db9fb1c3621ffd1971fd861503e56b1ff04659a8478faaa8fde0893de938ff2c930975051cb64db78e54f91b225a31f9ecf76b49c72d14f77f867a60321d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blx-caspervector-base.def) tex(blx-caspervector-gbk.def) tex(blx-caspervector-utf8.def) tex(caspervector-ay.bbx) tex(caspervector-ay.cbx) tex(caspervector.bbx) tex(caspervector.cbx) texlive-biblatex-caspervector"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(authoryear-comp.bbx) tex(authoryear-comp.cbx) tex(numeric-comp.bbx) tex(numeric-comp.cbx) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
