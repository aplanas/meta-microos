SUMMARY = "Colours by wavelength of visible light"
DESCRIPTION = "The package allows the user to obtain an RGB value (suitable \
for use in the color package) from a wavelength of light. The \
default unit is nanometres, but other units may be used. Note \
that this function is also available within xcolor."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-colorwav-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "c345c36fb4db532af04b00e935e4ea3f871ee50606ef15037cf7f05a744dc3e9b24d257b17fd60f83ff1a0d4786b899f294748902e48800d4267565d122ba163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colorwav.sty) \
texlive-colorwav"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
