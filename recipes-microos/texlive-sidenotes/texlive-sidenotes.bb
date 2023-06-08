SUMMARY = "Typeset notes containing rich content, in the margin"
DESCRIPTION = "The package allows typesetting of texts with notes, figures, \
citations, captions and tables in the margin. This is common \
(for example) in science text books."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00asvn54524"

RPM_NAME = "texlive-sidenotes-2023.201.1.00asvn54524-53.1.noarch.rpm"
RPM_HASH = "609e9203d045c1817c6732a9c61d7550214125cad1f2314215e9c95d769ad8ee69bdf89925748c662913cb5ff7c116ed87115bb8864b4b0cd92f491896aa175f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(caesar_book.cls) tex(sidenotes.sty) texlive-sidenotes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(beramono.sty) tex(caption.sty) tex(changepage.sty) tex(color.sty) tex(enumitem.sty) tex(fancyhdr.sty) tex(fontenc.sty) tex(fontspec.sty) tex(geometry.sty) tex(helvet.sty) tex(ifluatex.sty) tex(ifthen.sty) tex(l3keys2e.sty) tex(marginfix.sty) tex(marginnote.sty) tex(mathpazo.sty) tex(mhchem.sty) tex(microtype.sty) tex(morefloats.sty) tex(ragged2e.sty) tex(textcase.sty) tex(titlesec.sty) tex(titletoc.sty) tex(unicode-math.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
