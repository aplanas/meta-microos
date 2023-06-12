SUMMARY = "Cyrillic bibtex and makeindex"
DESCRIPTION = "The cyrillic-bin package"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn62517"

RPM_NAME = "texlive-cyrillic-bin-2023.204.svn62517-54.1.noarch.rpm"
RPM_HASH = "0b62ee65a66369cfbc4378359d7a63c8dd63b783169479f7f13ec16f515a7bd32f92fb7d28a737b26171a3213f409dbee964ea048475f4ff565efe4c6663b741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-bin"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cyrillic-bin-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
