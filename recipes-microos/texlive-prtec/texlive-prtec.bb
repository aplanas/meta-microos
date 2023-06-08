SUMMARY = "A template for PRTEC conference papers"
DESCRIPTION = "This package provides a LaTeX class, a BibTeX style, and a \
LaTeX template to format conference papers for the Pacific Rim \
Thermal Engineering Conference (PRTEC). The .tex and .cls files \
are commented and should be self-explanatory. The package \
depends on newtx."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn51919"

RPM_NAME = "texlive-prtec-2023.201.1.06svn51919-52.1.noarch.rpm"
RPM_HASH = "44c2c1dbd77572972060f7b0970f99c6e1be10f4ce343ceb661539f29fd4b313a71f701d8b879f1e5d5fbe35bc2beb63b203353f7c9c910a377f6a7bedcaef8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(prtec.cls) texlive-prtec"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(article.cls) tex(bm.sty) tex(booktabs.sty) tex(caption.sty) tex(dcolumn.sty) tex(doi.sty) tex(etoolbox.sty) tex(fancyhdr.sty) tex(fnpos.sty) tex(geometry.sty) tex(graphicx.sty) tex(hologo.sty) tex(hyperxmp.sty) tex(ifthen.sty) tex(inputenc.sty) tex(kvoptions.sty) tex(kvsetkeys.sty) tex(mathtools.sty) tex(metalogo.sty) tex(multicol.sty) tex(natbib.sty) tex(newtxmath.sty) tex(newtxtext.sty) tex(parskip.sty) tex(subcaption.sty) tex(textcase.sty) tex(titlesec.sty) tex(xcoffins.sty) tex(xcolor.sty) tex(xparse.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
