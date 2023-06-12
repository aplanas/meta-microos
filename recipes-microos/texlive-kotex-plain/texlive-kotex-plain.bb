SUMMARY = "Macros for typesetting Korean under Plain TeX"
DESCRIPTION = "The package provides macros for typesetting Hangul, the native \
alphabet of the Korean language, using plain *TeX. Input Korean \
text should be encoded in UTF-8. The package belongs to the \
ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.0svn63689"

RPM_NAME = "texlive-kotex-plain-2023.201.3.0.0svn63689-55.1.noarch.rpm"
RPM_HASH = "80c984e4000fc32602c23d3a36432ed3e6d346ec34059b23f359b1b25d1f3c1af91bd3fb69f6174579f089a17b8cb9854570170921341286f81c0c041f20bbf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hangulcweb.tex) \
tex(kotexplain.tex) \
tex(kotexutf-core.tex) \
tex(kotexutf.tex) \
texlive-kotex-plain"
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
