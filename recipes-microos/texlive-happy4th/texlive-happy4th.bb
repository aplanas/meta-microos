SUMMARY = "A firework display in obfuscated TeX"
DESCRIPTION = "The output PDF file gives an amusing display, as the reader \
pages through it."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20120102svn25020"

RPM_NAME = "texlive-happy4th-2023.201.20120102svn25020-53.1.noarch.rpm"
RPM_HASH = "5454b343a937913869b2083c34975e95dad1424d9564ab54f106f0ea8199f06ebbd9dc3e22471a2d0a29b267e1b0f6f7f3e03451d378aeee679281fad0cefefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-happy4th"
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
