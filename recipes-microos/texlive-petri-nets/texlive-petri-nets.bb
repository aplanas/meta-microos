SUMMARY = "A set TeX/LaTeX packages for drawing Petri nets"
DESCRIPTION = "Petri-nets offers a set of TeX/LaTeX packages about Petri nets \
and related models. Three packages are available: the first \
allows the user to draw Petri-nets in PostScript documents; the \
second defines macros related to PBC, M-nets and B(PN) models; \
and a third that combines the other two."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn39165"

RPM_NAME = "texlive-petri-nets-2023.201.svn39165-51.1.noarch.rpm"
RPM_HASH = "c513d960b4c5d1b1733a763c9a2a7349284e3134d58a41acd0f16584f2a4c51e35f5056c1b1ca92595fb024c0ae7b373de3a6aab3bd08fb3e4a3b07666229f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pndraw.sty) \
tex(pndraw.tex) \
tex(pnets.sty) \
tex(pnets.tex) \
tex(pntext.sty) \
tex(pntext.tex) \
tex(pnversion.tex) \
texlive-petri-nets"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Digest::MD5) \
perl(Getopt::Long) \
perl(strict) \
sed \
tex(amsfonts.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-petri-nets-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
