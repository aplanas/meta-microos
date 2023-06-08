SUMMARY = "\\newcommand-like commands for defining math macros"
DESCRIPTION = "This package provides functionalities for defining macros that \
have different behaviors depending on whether in math or text \
mode, that absorb Primes, Indices and Exponents (PIE) as extra \
parameters usable in the code; and it offers some iteration \
facilities for defining macros with similar code. The primary \
objective of this package is to be used together with the \
knowledge package for a proper handling of mathematical \
notations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn59512"

RPM_NAME = "texlive-mathcommand-2023.201.1.04svn59512-52.1.noarch.rpm"
RPM_HASH = "2a3102a0249bd9ec83f0eb770376de6c55b11b0ca7315e1dc965e34f48b3a3cb39463e50f495df7124e4620eb79d635121cb02c79963c7d3f8df892c514620df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathcommand.sty) texlive-mathcommand"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(expl3.sty) tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
