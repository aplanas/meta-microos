SUMMARY = "Flexible diagramming macros"
DESCRIPTION = "A package for typesetting a variety of graphs and diagrams with \
TeX. Xy-pic works with most formats (including LaTeX, \
AMS-LaTeX, AMS-TeX, and plain TeX). The distribution includes \
Michael Barr's diag package, which was previously distributed \
stand-alone."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.8.9svn61719"

RPM_NAME = "texlive-xypic-2023.201.3.8.9svn61719-52.1.noarch.rpm"
RPM_HASH = "f1b4330cb46e2b3bab722f5dcec56caf080b7304761384ad4e2e3906a9d32f3a49de10d225e670ee3870822e8f8dd158e11d5b809dcf69968a6fb02add43d64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(movie.cls) tex(xy.sty) tex(xy.tex) tex(xy16textures.tex) tex(xy17oztex.tex) tex(xy2cell.tex) tex(xyall.tex) tex(xyarc.tex) tex(xyarrow.tex) tex(xyatip10.tfm) tex(xybarr.tex) tex(xybsql10.tfm) tex(xybtip10.tfm) tex(xycirc.enc) tex(xycirc10.tfm) tex(xycmactex.tex) tex(xycmat10.tfm) tex(xycmat11.tfm) tex(xycmat12.tfm) tex(xycmbt10.tfm) tex(xycmbt11.tfm) tex(xycmbt12.tfm) tex(xycmtip.tex) tex(xycolor.tex) tex(xycrayon.tex) tex(xycurve.tex) tex(xyd.enc) tex(xyd2.enc) tex(xydash10.tfm) tex(xydummy.tex) tex(xydvidrv.tex) tex(xydvips.tex) tex(xydvitops.tex) tex(xyemtex.tex) tex(xyeuat10.tfm) tex(xyeuat11.tfm) tex(xyeuat12.tfm) tex(xyeubt10.tfm) tex(xyeubt11.tfm) tex(xyeubt12.tfm) tex(xyframe.tex) tex(xygraph.tex) tex(xyidioms.tex) tex(xyimport.tex) tex(xyknot.tex) tex(xyline.tex) tex(xyline10.tfm) tex(xyluat10.tfm) tex(xyluat11.tfm) tex(xyluat12.tfm) tex(xylubt10.tfm) tex(xylubt11.tfm) tex(xylubt12.tfm) tex(xymatrix.tex) tex(xymisc10.tfm) tex(xymovie.tex) tex(xynecula.tex) tex(xyoztex.tex) tex(xypdf-co.tex) tex(xypdf-cu.tex) tex(xypdf-fr.tex) tex(xypdf-li.tex) tex(xypdf-ro.tex) tex(xypdf.tex) tex(xypic.map) tex(xypic.sty) tex(xypic.tex) tex(xypicture.tex) tex(xypoly.tex) tex(xyps-c.tex) tex(xyps-col.tex) tex(xyps-f.tex) tex(xyps-l.tex) tex(xyps-pro.tex) tex(xyps-ps.tex) tex(xyps-r.tex) tex(xyps-s.tex) tex(xyps-t.tex) tex(xyps.tex) tex(xypsdict.tex) tex(xypspatt.tex) tex(xyqc10.tfm) tex(xyrecat.tex) tex(xyrotate.tex) tex(xysmart.tex) tex(xytextures.tex) tex(xytile.tex) tex(xytips.tex) tex(xytp-f.tex) tex(xytpic.tex) tex(xyv2.tex) tex(xyweb.tex) tex(xyxdvi.tex) texlive-xypic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(ifpdf.sty) tex(keyval.sty) tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-xypic-fonts"

inherit rpm
