SUMMARY = "Supplementary outer and inner themes for beamer"
DESCRIPTION = "This bundle provides a collection of inner and outer themes as \
supplements to the default themes in the beamer distribution. \
These themes can be used in combination with existing inner, \
outer, and color themes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02asvn56087"

RPM_NAME = "texlive-beamerauxtheme-2023.201.1.02asvn56087-53.1.noarch.rpm"
RPM_HASH = "ca9c97fc67b0503059ca8c3799af3fcd857299897b63e7f03aff6eba431b90e53f58acdd49869660efac5e5da2757e883615553d4cda919853dbb102c4e40642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerinnerthemesimplelines.sty) \
tex(beamerouterthemesidebarwithminiframes.sty) \
tex(beamerouterthemesplitwithminiframes.sty) \
tex(beamerouterthemetwolines.sty) \
texlive-beamerauxtheme"
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
