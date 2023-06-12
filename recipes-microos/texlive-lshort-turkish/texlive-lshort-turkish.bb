SUMMARY = "Turkish introduction to LaTeX"
DESCRIPTION = "A Turkish translation of Oetiker's (not so) short introduction."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.20svn15878"

RPM_NAME = "texlive-lshort-turkish-2023.201.4.20svn15878-52.1.noarch.rpm"
RPM_HASH = "78f75f2e704ce20320d2838e06beee204b4035d01921574be5f761062fc879c17d967fb8b9fe34902466443ac31c0124d104839742c1714792252ad386423c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-turkish"
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
