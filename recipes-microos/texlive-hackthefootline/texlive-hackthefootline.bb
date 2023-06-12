SUMMARY = "Footline selection and configuration for LaTeX beamer's standard themes"
DESCRIPTION = "This package is taking over, defining and redefining different \
footlines. Configuration is provided via using key-value \
syntax. It depends on the pgfkeys used for providing the \
configuration keys. Optional features require the following \
LaTeX packages: appendixnumberbeamer, calc, etoolbox, and \
numprint."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46494"

RPM_NAME = "texlive-hackthefootline-2023.201.svn46494-53.1.noarch.rpm"
RPM_HASH = "7535fb01eb8bf7915a70ef72ac74f876b7f9465878459f388f4140b85d93fe419457071394e77bd6ca64c7aed55c28069216603c3a9c2fda008ae187136ede4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hackthefootline.sty) \
texlive-hackthefootline"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(appendixnumberbeamer.sty) \
tex(calc.sty) \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(numprint.sty) \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
