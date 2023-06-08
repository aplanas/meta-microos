SUMMARY = "Poor man's box drawing characters"
DESCRIPTION = "This package declares box drawing characters of old code pages, \
e.g. cp437. It uses rules instead of using a font."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn53046"

RPM_NAME = "texlive-pmboxdraw-2023.201.1.4svn53046-52.1.noarch.rpm"
RPM_HASH = "178e41d73032816e8aa99947ce399d34037d95b689b2990f4319db82cb2c413dcbf772464420536223ccd098ab70eecac52538baebb350713c068da71f9483a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pmboxdraw.sty) texlive-pmboxdraw"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
