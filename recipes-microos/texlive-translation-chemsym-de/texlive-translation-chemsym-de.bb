SUMMARY = "German version of chemsym"
DESCRIPTION = "This is a 'translation' of the chemsym documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23804"

RPM_NAME = "texlive-translation-chemsym-de-2023.201.svn23804-52.1.noarch.rpm"
RPM_HASH = "bb1955a41e92820bf30dc455155b0632d691bb49489f811b2042073e120354c6bdce54f2d1fe2ec121746887f3c0886e80c26259cdd924db0e3328442789f903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-chemsym-de"
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
