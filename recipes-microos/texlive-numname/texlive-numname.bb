SUMMARY = "Convert a number to its English expression"
DESCRIPTION = "The package can generate cardinal (one, two, ...) and ordinal \
(first, second, ...) numbers. The code derives from the memoir \
class, and is extracted for the convenience of non-users of \
that class."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18130"

RPM_NAME = "texlive-numname-2023.201.svn18130-54.1.noarch.rpm"
RPM_HASH = "58298f5d58c347e63faf216d2dbe466916f10aa8a9f65b190b80c926947ac78e061ea749bd2871f7d749a56a08c25e3d32a17ae5b12919d8700d3fdb5452f32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(numname.sty) \
texlive-numname"
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
