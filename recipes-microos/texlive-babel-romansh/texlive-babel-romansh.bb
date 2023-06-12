SUMMARY = "Babel/Polyglossia support for the Romansh language"
DESCRIPTION = "The package provides a language description file that enables \
support of Romansh either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn30286"

RPM_NAME = "texlive-babel-romansh-2023.201.svn30286-53.1.noarch.rpm"
RPM_HASH = "dcf8cc95bd93bde734f25b66c1ffcdbd10cb406a053ce851fcc3e0e48a6b651035f71137f669bf054beb9fcce14c8c3364090f33a7b7652e88ad278583f85b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romansh.ldf) \
texlive-babel-romansh"
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
