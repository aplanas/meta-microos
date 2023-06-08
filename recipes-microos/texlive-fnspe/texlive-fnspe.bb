SUMMARY = "Macros for supporting mainly students of FNSPE CTU in Prague"
DESCRIPTION = "This package is primary intended for students of FNSPE CTU in \
Prague but many other students or scientists can found this \
package as useful. This package implements different standards \
of tensor notation, interval notation and complex notation. \
Further many macros and shortcuts are added, e.q. for spaces, \
operators, physics unit, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn45360"

RPM_NAME = "texlive-fnspe-2023.201.1.2asvn45360-52.1.noarch.rpm"
RPM_HASH = "108f74c19726ed8aba1fc6c471411fae2fe2ea3fc2de24a6f36f125d161f0bcd04695b898c129a42f7cc92a893817ef9341ca92bf0597f74a9cd66d3be33e9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fnspe.sty) texlive-fnspe"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(bm.sty) tex(listings.sty) tex(mathrsfs.sty) tex(mathtools.sty) tex(physics.sty) tex(substr.sty) tex(tikz.sty) tex(xcolor.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
