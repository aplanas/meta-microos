SUMMARY = "Problem sheet class"
DESCRIPTION = "This class is designed to simplify the typesetting of problem \
sheets with Mathematics and Computer Science content. It is \
currently customised towards teaching in French (and the \
examples are in French)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn24830"

RPM_NAME = "texlive-pbsheet-2023.201.0.0.1svn24830-51.1.noarch.rpm"
RPM_HASH = "367503aa4d18d6aba451995085dbb12baead47f595bd8d1cc1a44578da9eea124e5c4b49b68ee59b9827e3cccd15ba45f37b3f9b4598a0f67ed7e5db61de96fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pbsheet.cls) texlive-pbsheet"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(aeguill.sty) tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(babel.sty) tex(color.sty) tex(fontenc.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(inputenc.sty) tex(latexsym.sty) tex(listings.sty) tex(moreverb.sty) tex(rotating.sty) tex(url.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
