SUMMARY = "Macros to typeset calculational proofs and programs in Dijkstra's style"
DESCRIPTION = "Edsger W. Dijkstra and others suggest a unique style to present \
mathematical proofs and to construct programs. This package \
provides macros that support calculational proofs and \
Dijkstra's 'guarded command language'."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-tex-ewd-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "62e88cdf5da249be6bdfb7795f5c57b7536885ceb3ea1255279264ba059394367e036d12f4883a641f0db0604448c9e468769fa688536143e12400b191d2b6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dotnot.tex) texlive-tex-ewd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
