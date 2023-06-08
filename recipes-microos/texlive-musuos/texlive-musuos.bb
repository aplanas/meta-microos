SUMMARY = "Typeset papers for the department of music, Osnabruck"
DESCRIPTION = "The package provides a LaTeX class for typesetting term papers \
at the institute of music and musicology of the University of \
Osnabruck, Germany, according to the specifications of Prof. \
Stefan Hahnheide. A BibLaTeX style is provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1dsvn24857"

RPM_NAME = "texlive-musuos-2023.201.1.1dsvn24857-54.1.noarch.rpm"
RPM_HASH = "7234edabb8f01cda620938ddf9be15272be3459edb22c2f81167940db071bbf0976f3d96d64a2fb3faa197a3e1e5819ac6f3bf1cde7e56ef1fd45f5ed6edc46e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(musuos.cls) texlive-musuos"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(csquotes.sty) tex(dblfnote.sty) tex(environ.sty) tex(etoolbox.sty) tex(float.sty) tex(geometry.sty) tex(helvet.sty) tex(kpfonts.sty) tex(kvoptions.sty) tex(scrartcl.cls) tex(setspace.sty) tex(tgheros.sty) tex(titletoc.sty) tex(txfonts.sty) tex(verse.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
