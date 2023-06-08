SUMMARY = "Easily annotate math equations using TikZ"
DESCRIPTION = "This package provides commands that make it easy to highlight \
terms in equations and add annotation labels using TikZ. It \
should work with pdfLaTeX as well as LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn65851"

RPM_NAME = "texlive-annotate-equations-2023.201.0.0.2.0svn65851-54.1.noarch.rpm"
RPM_HASH = "9c4d3501f1a0b6917d381f64a153cce1176bdc9ffd1bcf3c4a618ea0e20f254fbe9ae06a8ca9a5152037c0f4cbd6ec2b81c269bc7f0a2a924528722bdfbf35fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(annotate-equations.sty) texlive-annotate-equations"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(ifluatex.sty) tex(luatex85.sty) tex(pdftexcmds.sty) tex(tikz.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
