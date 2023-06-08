SUMMARY = "Additional support for UTF-8 encoded LaTeX input"
DESCRIPTION = "This bundle contains the LaTeX packages utf8add.sty and \
utf8hax.sty. The utf8add package provides additional support \
for the use of UTF-8 encoded input. This is intended for making \
LaTeX input more readable. The utf8hax package is using UTF-8 \
characters for easier access to math in LaTeX, however making \
the LaTeX input less readable."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61074"

RPM_NAME = "texlive-utf8add-2023.201.svn61074-53.1.noarch.rpm"
RPM_HASH = "40d60f322850159d1cd69201b5ff45cf5ec88001cd05ef1700094c5d54005898857db0740283ac6e16d6f11f8e47c57b326d5017f86f1660ca1cbb015471ec44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(utf8add.sty) tex(utf8hax.sty) texlive-utf8add"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(gensymb.sty) tex(inputenc.sty) tex(nicefrac.sty) tex(upgreek.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
