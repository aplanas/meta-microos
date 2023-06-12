SUMMARY = "Convert one DVI file into another"
DESCRIPTION = "The output DVI file's contents are specified by page selection \
commands; series of pages and page number ranges may be \
specified, as well as inclusions and exclusions."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65952"

RPM_NAME = "texlive-dvidvi-2023.201.svn65952-53.1.noarch.rpm"
RPM_HASH = "37f426fa11e5bacc3427e7d9e7998bd2a4b46220c2cdfffe8274dcb40653794b5c28de8d22f215d7880f473f50af9afc5fbeaf4778372264047bb7d439a45817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dvidvi.1) \
texlive-dvidvi"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvidvi-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
