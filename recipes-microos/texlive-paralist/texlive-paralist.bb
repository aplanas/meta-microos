SUMMARY = "Enumerate and itemize within paragraphs"
DESCRIPTION = "Provides enumerate and itemize environments that can be used \
within paragraphs to format the items either as running text or \
as separate paragraphs with a preceding number or symbol. Also \
provides compacted versions of enumerate and itemize."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn43021"

RPM_NAME = "texlive-paralist-2023.201.2.7svn43021-51.1.noarch.rpm"
RPM_HASH = "39993277e5955b3a481367fc51563ad839b3752081f5be9a3528f8706cd80018d0dbf1e1f10e592ad7c6b93db894662842c9964d1d1289032b8a80ae0701a829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(paralist.sty) texlive-paralist"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
