SUMMARY = "Severed fonts for texlive-aramaic-serto"
DESCRIPTION = "The  separated fonts package for texlive-aramaic-serto"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30042"

RPM_NAME = "texlive-aramaic-serto-fonts-2023.201.1.0svn30042-54.1.noarch.rpm"
RPM_HASH = "19677c4a47c8178d74e22f7ef5d727d8999b3c82254ab2b9c5dd30ffb566b1ce2febfcb95f34e4c95375a0959096b31c6569ef3bcf63c4352061b0bfb3e1f96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(assy) \
font(assyrb10) \
font(serto10) \
font(sertob10) \
texlive-aramaic-serto-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
