SUMMARY = "Generate invoices for Belgian non-profit organizations"
DESCRIPTION = "This package provides templates and a sty file for generating \
invoices for Belgian non-profit organizations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn50010"

RPM_NAME = "texlive-modeles-factures-belges-assocs-2023.201.1.0.1svn50010-54.1.noarch.rpm"
RPM_HASH = "b1d10cd39e0377820dc564800bf81c257b088a7b5f8b1cba5b8c3b9412d1d03fb377374df6d5feaa33302ed2c841f06f50c2171da5662890b86dbe138fb49fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(modeles-factures-belges-associations.sty) texlive-modeles-factures-belges-assocs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(array.sty) tex(babel.sty) tex(calctab.sty) tex(color.sty) tex(colortbl.sty) tex(eurosym.sty) tex(fancyhdr.sty) tex(fontspec.sty) tex(geometry.sty) tex(hyperref.sty) tex(ifthen.sty) tex(inputenc.sty) tex(lmodern.sty) tex(mathrsfs.sty) tex(mathtools.sty) tex(multirow.sty) tex(soul.sty) tex(ulem.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
