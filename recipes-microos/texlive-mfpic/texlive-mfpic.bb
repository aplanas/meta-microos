SUMMARY = "Draw Metafont/post pictures from (La)TeX commands"
DESCRIPTION = "Mfpic is a scheme for producing pictures from (La)TeX commands. \
Commands \\mfpic and \\endmfpic (in LaTeX, the mfpic environment) \
enclose a group in which drawing commands may be placed. The \
commands generate a Meta-language file, which may be processed \
by MetaPost (or even Metafont). The resulting image file will \
be read back in to the document to place the picture at the \
point where the original (La)TeX commands appeared. Note that \
the ability to use MetaPost here means that the package works \
equally well in LaTeX and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn28444"

RPM_NAME = "texlive-mfpic-2023.201.1.10svn28444-54.1.noarch.rpm"
RPM_HASH = "fff6e0982fae66f61a4a86f5355b386ff2d6befa18d2bfe8af02797b9db7de97c2ffdca30acd52fc23b37187fa32af0d8eaaf4b06658e24b40b31acce530f13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mfpic.sty) tex(mfpic.tex) tex(mfpicdef.tex) texlive-mfpic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphics.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
