SUMMARY = "A package for typesetting epigraphs"
DESCRIPTION = "Epigraphs are the pithy quotations often found at the start (or \
end) of a chapter. Both single epigraphs and lists of epigraphs \
are catered for. Various aspects are easily configurable."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn54857"

RPM_NAME = "texlive-epigraph-2023.201.1.5esvn54857-53.1.noarch.rpm"
RPM_HASH = "6748e63d02fcc91372270fe2f91822d546a4a9d696cfcf40ebb52835cf8a6dbba092634b2ba8a790c2b39deba6eaf08d6b5eaa610677cc0c07e050f9f0219f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epigraph.sty) \
texlive-epigraph"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(nextpage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
