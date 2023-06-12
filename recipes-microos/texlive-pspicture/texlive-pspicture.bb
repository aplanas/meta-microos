SUMMARY = "PostScript picture support"
DESCRIPTION = "A replacement for LaTeX's picture macros, that uses PostScript \
\\special commands. The package is now largely superseded by \
pict2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pspicture-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "674d9865752130c71fbafa336665df0fbf89682a74a7b2c41259ce51fa21ce0bb3caa65321e91262bf39b71ad5d653591b282b2b3994bb43ea8277e998bf7bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pspicture.sty) \
texlive-pspicture"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
