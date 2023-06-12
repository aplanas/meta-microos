SUMMARY = "LaTeX template for theses at Southeastern University"
DESCRIPTION = "This template is for theses at Southeastern University, \
Nanjing, China."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1.2svn33042"

RPM_NAME = "texlive-seuthesis-2023.201.2.1.2svn33042-53.1.noarch.rpm"
RPM_HASH = "e7209bb906baa47736b64c0c6441e778121665ed7d8473bcc84a732b886d30e95dfab5e24a674c8ef1857bbe3e4b184f6aafb150a873a52be6375a435b2408bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seuthesis"
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
