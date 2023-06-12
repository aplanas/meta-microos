SUMMARY = "A theme for the beamer class"
DESCRIPTION = "This package provides the 'Verona' theme for the beamer class \
by Till Tantau."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn39180"

RPM_NAME = "texlive-beamer-verona-2023.201.0.0.2svn39180-53.1.noarch.rpm"
RPM_HASH = "e81bc9db66795a11ece739cfa4d4d7a50ac00db11e7d92a8c247b826cd32823df188c62ddad688e729ee0862d452cc714e0edccf40f22f425c1a58c396952307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerthemeVerona.sty) \
texlive-beamer-verona"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tcolorbox.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
