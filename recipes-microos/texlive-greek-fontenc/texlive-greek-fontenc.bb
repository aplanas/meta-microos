SUMMARY = "LICR macros and encoding definition files for Greek"
DESCRIPTION = "The package provides Greek LICR macro definitions and encoding \
definition files for Greek text font encodings for use with \
fontenc."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-2023.201.2.2.1svn66513-53.1.noarch.rpm"
RPM_HASH = "336cd347c8265c647348695aa2d9d6107904f60130ad0edb7e77c70f51409f43d4fa4c9fd8b981a3d9176644ada351fcd92a1bd1d541ff0c1dc1eb131d6687e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alphabeta-lgr.def) \
tex(alphabeta-tuenc.def) \
tex(alphabeta.sty) \
tex(greek-euenc.def) \
tex(greek-fontenc.def) \
tex(lgrenc.def) \
tex(puenc-greek.def) \
tex(textalpha.sty) \
tex(tuenc-greek.def) \
texlive-greek-fontenc"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua \
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
