SUMMARY = "Arbitrary precision numbers implemented by TeX macros"
DESCRIPTION = "The basic operations (addition, subtraction, multiplication, \
division, power to an integer) are implemented by TeX macros in \
this package. Operands may be numbers with arbitrary numbers of \
digits; scientific notation is allowed. The expression scanner \
is also provided. As of version 1.4 (December 2015) the \
calculation of common functions (sqrt, exp, ln, sin, cos, tan, \
asin, acos, atan, pi) with arbitrary precision in the result \
has been added. Exhaustive documentation (including detailed \
TeXnical documentation) is included. The macro includes many \
optimizations and uses only TeX primitives (from classic TeX) \
and \\newcount macro."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.7svn47510"

RPM_NAME = "texlive-apnum-2023.201.1.7svn47510-54.1.noarch.rpm"
RPM_HASH = "1e66624c1951caabb402bf625729b51722d5bb800811495aedd9d66ab53e18b8c1b06999d7a850794a447311c476bb753360574c78b87420d2743445bfd44bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(apnum.tex) texlive-apnum"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
