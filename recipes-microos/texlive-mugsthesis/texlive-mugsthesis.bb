SUMMARY = "Thesis class complying with Marquette University Graduate School requirements"
DESCRIPTION = "The bundle offers a thesis class, based on memoir, that \
complies with Marquette University Graduate School \
requirements."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64259"

RPM_NAME = "texlive-mugsthesis-2023.201.1.1svn64259-54.1.noarch.rpm"
RPM_HASH = "e29049226102b2531ab9af18098841cc54ae869c6e2b0e5df6f294aee5b2ee9afde6b0e6d81d208781c03b7b352d46d48de98e111877673e45cb6181c181669a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mugsthesis.cls) \
texlive-mugsthesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(indentfirst.sty) \
tex(memoir.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
