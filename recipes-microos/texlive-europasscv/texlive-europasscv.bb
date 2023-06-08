SUMMARY = "Unofficial class for the new version of the Europass curriculum vitae"
DESCRIPTION = "This class is an unofficial LaTeX implementation of the \
Europass CV, the standard model for curriculum vitae as \
recommended by the European Commission. It includes the major \
style updates that came out in 2013, featuring a neater, more \
compact and somewhat fancier layout."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56829"

RPM_NAME = "texlive-europasscv-2023.201.svn56829-52.1.noarch.rpm"
RPM_HASH = "c88c7d9caceee825223ea928f27ca80b8b2cc6be13fdb6a35f6e150faef2f2d32d94d0deb671b96179ef1aa334ddd433768d4561e222a6e49c2716d60889bfa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(europasscv-bibliography.sty) tex(europasscv.cls) tex(europasscv_ca.def) tex(europasscv_cs.def) tex(europasscv_da.def) tex(europasscv_de.def) tex(europasscv_el.def) tex(europasscv_en.def) tex(europasscv_es.def) tex(europasscv_fr.def) tex(europasscv_hu.def) tex(europasscv_it.def) tex(europasscv_nb.def) tex(europasscv_pl.def) tex(europasscv_pt.def) tex(europasscv_ro.def) tex(europasscv_sk.def) tex(europasscv_sl.def) tex(europasscv_sv.def) tex(europasscv_tr.def) texlive-europasscv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(article.cls) tex(biblatex-ext-tabular.sty) tex(colortbl.sty) tex(enumitem.sty) tex(fancyhdr.sty) tex(fontenc.sty) tex(fontspec.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(iftex.sty) tex(inputenc.sty) tex(keyval.sty) tex(lastpage.sty) tex(longtable.sty) tex(setspace.sty) tex(showframe.sty) tex(soul.sty) tex(substr.sty) tex(textcomp.sty) tex(url.sty) tex(xcolor.sty) tex(xifthen.sty) tex(xparse.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
