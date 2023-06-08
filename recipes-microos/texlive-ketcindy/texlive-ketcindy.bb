SUMMARY = "Macros for graphic generation and Cinderella plugin"
DESCRIPTION = "KETpic is a macro package designed for computer algebra systems \
(CAS) to generate LaTeX source codes for high-quality \
mathematical artwork. KETcindy is a plugin for Cinderella that \
allows to generate graphics using KETpic. The generated code \
can be included in any LaTeX document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20191225.0svn58661"

RPM_NAME = "texlive-ketcindy-2023.201.20191225.0svn58661-55.1.noarch.rpm"
RPM_HASH = "6127449250c479e936b90db3b83e529a64e828eb1b798616dd1350b5b6f0f1d96e5ebef74ae7dd4e7c5e40dd441b177d3c82665835f2ef70ad709e72056c2bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(KetCindyPlugin.jar) tex(ketlayer.sty) tex(ketlayer2e.sty) tex(ketmedia.sty) tex(ketpic.sty) tex(ketpic2e.sty) tex(ketslide.sty) tex(ketslide2.sty) texlive-ketcindy"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep java perl(Digest::MD5) perl(File::Copy) perl(strict) sed tex(amsmath.sty) tex(amssymb.sty) tex(color.sty) tex(graphicx.sty) texlive texlive-filesystem texlive-ketcindy-bin texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
