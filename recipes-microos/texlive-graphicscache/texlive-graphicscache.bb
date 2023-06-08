SUMMARY = "Cache includegraphics calls"
DESCRIPTION = "This LaTeX package provides caching of \\includegraphics calls, \
with several useful effects: Recompilations are much faster \
(10x speedup observed). Images can be postprocessed with \
ghostscript before inclusion, thus: Automatic downscaling to \
specified DPI Automatic JPEG compression with configurable \
quality Much smaller files (e.g. 10MB instead of 150MB)! Note: \
Due to the one-by-one invocation of pdflatex and ghostscript \
for each graphics element, the first compilation is typically \
slower than usual. Note: graphicscache needs the \\write18 call \
(also called shell escape). This is a security risk if you have \
untrusted TeX sources. graphicscache supports pdfLaTeX and \
LuaLaTeX; XeLaTeX is not supported."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-2023.201.0.0.4svn65318-53.1.noarch.rpm"
RPM_HASH = "3b37cf592604d2cb69bc9c872f9d3418532dc3a47f58f2091a75cfa9fcc3a084e03938be4ddb39ef42203bdfef7123fbcad99088bf30f27ca0dbaafc69906e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(graphicscache.sty) texlive-graphicscache"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(filemod.sty) tex(graphicx.sty) tex(ifplatform.sty) tex(letltxmacro.sty) tex(ltxcmds.sty) tex(pdftexcmds.sty) tex(pgffor.sty) tex(pgfopts.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
