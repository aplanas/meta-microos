SUMMARY = "The LaTeX standard tools bundle"
DESCRIPTION = "A collection of (variously) simple tools provided as part of \
the LaTeX required tools distribution, comprising the packages: \
afterpage, array, bm, calc, dcolumn, delarray, enumerate, \
fileerr, fontsmpl, ftnright, hhline, indentfirst, layout, \
longtable, multicol, rawfonts, showkeys, somedefs, tabularx, \
theorem, trace, varioref, verbatim, xr, and xspace."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64892"

RPM_NAME = "texlive-tools-2023.201.svn64892-52.1.noarch.rpm"
RPM_HASH = "0feec7d3818f5403bbe6196a8d20d5357ee0fa4dd769db69cc170c7a66fe97a42f7ceb1fee1c0451fafecf2e4386ae5307c30cc033308af256965b43314f4e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(afterpage.sty) tex(array-2016-10-06.sty) tex(array-2020-02-10.sty) tex(array.sty) tex(bm.sty) tex(calc.sty) tex(dcolumn.sty) tex(delarray.sty) tex(e.tex) tex(enumerate.sty) tex(fontsmpl.sty) tex(fontsmpl.tex) tex(ftnright.sty) tex(h.tex) tex(hhline.sty) tex(indentfirst.sty) tex(layout.sty) tex(longtable-2020-01-07.sty) tex(longtable.sty) tex(multicol-2017-04-11.sty) tex(multicol-2019-10-01.sty) tex(multicol.sty) tex(q.tex) tex(r.tex) tex(rawfonts.sty) tex(s.tex) tex(shellesc.sty) tex(showkeys-2014-10-28.sty) tex(showkeys.sty) tex(somedefs.sty) tex(tabularx.sty) tex(thb.sty) tex(thc.sty) tex(thcb.sty) tex(theorem.sty) tex(thm.sty) tex(thmb.sty) tex(thp.sty) tex(trace.sty) tex(varioref-2016-02-16.sty) tex(varioref.sty) tex(verbatim.sty) tex(verbtest.tex) tex(x.tex) tex(xr.sty) tex(xspace.sty) texlive-tools"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-extratools texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
