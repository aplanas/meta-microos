SUMMARY = "TeX Live manual (French)"
DESCRIPTION = "The texlive-fr package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66571"

RPM_NAME = "texlive-texlive-fr-2023.201.svn66571-54.1.noarch.rpm"
RPM_HASH = "d2d25e1b441720627efb6b4313f72d8459f11fc623e11533e89ad988e71e1a7c63cef1784021cdc461f41500cb3d73b4b1f534e52daecada67f805c1d051c06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-fr"
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
