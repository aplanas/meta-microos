SUMMARY = "Dummy text in Japanese"
DESCRIPTION = "This package enables users to print some Japanese text that can \
be used as dummy text. It is a Japanese counterpart of the \
lipsum package. Since there is no well-known nonsense text like \
Lipsum in the Japanese language, the package uses some real \
text in public domain."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn66013"

RPM_NAME = "texlive-bxjalipsum-2023.201.1.0svn66013-52.1.noarch.rpm"
RPM_HASH = "61827c355c683031a5f42419d408aaa1013efec3838e0acc4668f80fa1bc4225b70b9f5f25008014c7eada357e8fb89a08a26180aa8cded68ad7f99557bf8a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxjalipsum.sty) \
texlive-bxjalipsum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(intcalc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
