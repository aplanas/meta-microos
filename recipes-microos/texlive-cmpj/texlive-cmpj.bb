SUMMARY = "Style for the journal Condensed Matter Physics"
DESCRIPTION = "The package contains macros and some documentation for \
typesetting papers for submission to the Condensed Matter \
Physics journal published by the Institute for Condensed Matter \
Physics of the National Academy of Sciences of Ukraine."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.03svn58506"

RPM_NAME = "texlive-cmpj-2023.201.3.03svn58506-53.1.noarch.rpm"
RPM_HASH = "85373acd29f82377c07ef2c1188d926ae8b1716a79c4cb9da73a83673f544388eb0b67e6c09a32284db0362f137169ea1eaa07fdfe114ba82830ced99dfa43e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmpj.sty) tex(cmpj2.sty) tex(cmpj3.sty) texlive-cmpj"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(doi.sty) tex(droidsans.sty) tex(droidsansmono.sty) tex(droidserif.sty) tex(fancyhdr.sty) tex(fontenc.sty) tex(fourier.sty) tex(graphicx.sty) tex(hyperref.sty) tex(hyperxmp.sty) tex(ifthen.sty) tex(natbib.sty) tex(newtxmath.sty) tex(newtxtext.sty) tex(scalerel.sty) tex(textcomp.sty) tex(tikz.sty) tex(txfonts.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
