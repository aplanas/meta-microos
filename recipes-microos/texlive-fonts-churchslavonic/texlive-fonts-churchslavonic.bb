SUMMARY = "Fonts for typesetting in Church Slavonic language"
DESCRIPTION = "The package provides Unicode-encoded OpenType fonts for Church \
Slavonic which are intended for Unicode TeX engines only."
LICENSE = "OFL-1.1"

PV = "2023.201.2.2svn56350"

RPM_NAME = "texlive-fonts-churchslavonic-2023.201.2.2svn56350-52.1.noarch.rpm"
RPM_HASH = "ae2c41c32305f71421515a725fb1c91dbf9063bc55ec46ef584920849136814760949ddc869f6e2bc360447cb7697af819096bae77cba0f6179321a0e53c404d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-churchslavonic"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fonts-churchslavonic-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
