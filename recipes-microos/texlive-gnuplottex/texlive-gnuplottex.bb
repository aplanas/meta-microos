SUMMARY = "Embed Gnuplot commands in LaTeX documents"
DESCRIPTION = "This package allows you to include Gnuplot graphs in your LaTeX \
documents. The gnuplot code is extracted from the document and \
written to .gnuplot files. Then, if shell escape is used, the \
graph files are automatically processed to graphics or LaTeX \
code files which will then be included in the document. If \
shell escape isn't used, the user will have to manually convert \
the files by running gnuplot on the extracted .gnuplot files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-2023.201.0.0.9.5svn54758-53.1.noarch.rpm"
RPM_HASH = "cfe15ab6ad03095bce2924231cb0fb3680d2d64eff6331a7a595a351c85a4cbd81a83cbcd4973831f3f659a49726eceae6696d516c4a7ad60a123ed58a879bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gnuplottex.sty) texlive-gnuplottex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(catchfile.sty) tex(graphicx.sty) tex(ifthen.sty) tex(keyval.sty) tex(moreverb.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
