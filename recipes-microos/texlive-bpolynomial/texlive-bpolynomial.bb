SUMMARY = "Drawing polynomial functions of up to order 3"
DESCRIPTION = "This MetaPost package helps plotting polynomial and root \
functions up to order three. The package provides macros to \
calculate Bezier curves exactly matching a given constant, \
linear, quadratic or cubic polynomial, or square or cubic root \
function. In addition, tangents on all functions and \
derivatives of polynomials can be calculated."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-bpolynomial-2023.201.0.0.5svn15878-52.1.noarch.rpm"
RPM_HASH = "21009fdefd520bcbc39fca67b799697690268db3b123dfb939a5fec38e20c23c9df3651fac50a4c92b419bdc0fcea5c50ef2c4abb7c5d0a9030b806f01078301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpolynomial"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
