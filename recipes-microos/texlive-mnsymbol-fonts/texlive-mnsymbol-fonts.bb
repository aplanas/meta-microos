SUMMARY = "Severed fonts for texlive-mnsymbol"
DESCRIPTION = "The  separated fonts package for texlive-mnsymbol"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-fonts-2023.201.1.4svn18651-54.1.noarch.rpm"
RPM_HASH = "02b290373ededb037263e0fe31fa4323f7bc248ff5ecfd15e22621f01a18772ed37d55c9a482179843ef939c176e94e40097502de3ffce475facb91f9924f9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-mnsymbol-fonts) \
font(mnsymbol) \
texlive-mnsymbol-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
