SUMMARY = "Actuarial symbols of life contingencies and financial mathematics"
DESCRIPTION = "This package provides commands to compose actuarial symbols of \
life contingencies and financial mathematics characterized by \
subscripts and superscripts on both sides of a principal \
symbol. The package also features commands to easily and \
consistently position precedence numbers above or below \
statuses in symbols for multiple lives contracts. Since the \
actuarial notation can get quite involved, the package defines \
a number of shortcut macros to ease entry of the most common \
elements. Appendix A of the package documentation lists the \
commands to typeset a large selection of symbols of life \
contingencies. This package requires actuarialangle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54080"

RPM_NAME = "texlive-actuarialsymbol-2023.201.1.1svn54080-54.1.noarch.rpm"
RPM_HASH = "852737bedfa5fac076132f6606e27d46581ad8ab2f86d6dbb0c8dac124ee1a87ae8149d5b176684b88aa6e91f3673843e96106db0b15580d4542cd032bebd798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(actuarialsymbol.sty) \
texlive-actuarialsymbol"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(actuarialangle.sty) \
tex(amsmath.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
