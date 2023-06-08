SUMMARY = "Christmas silliness (English)"
DESCRIPTION = "This is the plain TeX file xii.tex. Call 'pdftex xii.tex' to \
produce a (perhaps) surprising typeset document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45804"

RPM_NAME = "texlive-xii-2023.201.svn45804-52.1.noarch.rpm"
RPM_HASH = "692122c6999bbd3c702c498f1336fc392802e7fb7a85f5e9743930d5cd3572f2b7b531f7d5ead5502c8f2c8a89fec4f376e0e0f6c14f14455f1bb6aa392b12cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
