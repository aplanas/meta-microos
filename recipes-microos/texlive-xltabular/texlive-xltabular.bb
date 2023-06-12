SUMMARY = "Longtable support with possible X-column specifier"
DESCRIPTION = "This package loads package ltablex, but keeps the current \
tabularx environment as is. The new environment xltabular is a \
combination of longtable and tabularx: Header/footer \
definitions, X-column specifier, and with possible pagebreaks."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-2023.201.0.0.2esvn56855-52.1.noarch.rpm"
RPM_HASH = "c67d8b94b151ab5775a2a15c63e192baa74136d71dce05d1f5f94fb21b13232d04d80b72025cc6ceb36b581129b1575f620b8266ed6e42757f4bc0aeaab522ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xltabular.sty) \
texlive-xltabular"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ltablex.sty) \
tex(tabularx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
