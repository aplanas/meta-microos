SUMMARY = "Copy DVI files, flattening VFs"
DESCRIPTION = "DVICOPY is a utility program that allows one to take a DVI file \
that references composite fonts (VF) and convert it into a DVI \
file that does not contain such references. It also serves as a \
basis for writing DVI drivers (much like DVItype)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.5svn66186"

RPM_NAME = "texlive-dvicopy-2023.201.1.5svn66186-53.1.noarch.rpm"
RPM_HASH = "aa12c1dd8e96f515e60d3a0d9df1686f66f3e847f9b295d08428558e64826fb5f81fd531789c640349d51dac9df2246cd9fd150a4fc97a23de202d2d27d6ce52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dvicopy.1) texlive-dvicopy"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-dvicopy-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
