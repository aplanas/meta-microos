SUMMARY = "Calculate formulas in a tabular environment"
DESCRIPTION = "Given a list of numbers and one (or more) formulas, the package \
offers an easy syntax to build a table of values, i.e., a \
tabular in which the first row contains the list of numbers, \
and the other rows contain the calculated values of the \
formulas for each number of the list. The table may be built \
either horizontally or vertically and is fully customizable."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-tabularcalc-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "4a69e71ed39769a71e4000da7f3b54932c16246853b440503ad55468d9179aba62d6c3e45f9fd55d7f00c338d2963a79a9e869081d48ec63af35367ef54115ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabularcalc.sty) texlive-tabularcalc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fp.sty) tex(numprint.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
