SUMMARY = "Package documentation class"
DESCRIPTION = "The class provides support for the documentation of the \
author's packages, using koma-script. This class is provided \
'as is' solely for the benefit of anyone who wants to compile \
the documentation of those packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.08svn64708"

RPM_NAME = "texlive-nlctdoc-2023.201.1.08svn64708-54.1.noarch.rpm"
RPM_HASH = "8bdfe6f445c3fa1cde34ddfee3b65d4e5d9b91f69f449826b0f912b4142655362d012722b88226c90cad9cd0ee673c119ce17dd4782ca55dbe8e0f617d245b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nlctdoc.cls) tex(nlctuserguide.sty) texlive-nlctdoc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsfonts.sty) tex(array.sty) tex(attachfile.sty) tex(cmap.sty) tex(doc.sty) tex(dox.sty) tex(etoolbox.sty) tex(fontawesome.sty) tex(fontenc.sty) tex(fontspec.sty) tex(fourier.sty) tex(glossaries-extra.sty) tex(hologo.sty) tex(hyperref.sty) tex(ifpdf.sty) tex(iftex.sty) tex(ifxetex.sty) tex(inputenc.sty) tex(luatex85.sty) tex(mfirstuc.sty) tex(pifont.sty) tex(scrhack.sty) tex(tcolorbox.sty) tex(tex4ht.sty) tex(textcomp.sty) tex(twemojis.sty) tex(upquote.sty) tex(varioref.sty) tex(xcolor.sty) tex(xr-hyper.sty) tex(xr.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
