SUMMARY = "A font for typesetting the International Phonetic Alphabet (IPA)"
DESCRIPTION = "This package provides the IPA font Doulos SIL in TrueType \
format."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.1svn63255"

RPM_NAME = "texlive-doulossil-2023.201.0.0.1svn63255-52.1.noarch.rpm"
RPM_HASH = "749a8a6296544a2d9f6e2080216c36e60ae74a19f23f510ffeae2b906467519fc3eea356eb8ef7a6dd5d2116aeeabe166d795bf83fef81d57f9dac1c8f536b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doulossil"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-doulossil-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
