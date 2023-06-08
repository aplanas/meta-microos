SUMMARY = "Alignment of plain text"
DESCRIPTION = "The package provides horizontal alignment, as in the LaTeX \
command \\listfiles (or the author's longnamefilelist package). \
Uses may include in-text tables, or even code listings."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn28140"

RPM_NAME = "texlive-monofill-2023.201.0.0.2svn28140-54.1.noarch.rpm"
RPM_HASH = "41a5d86a106e236c3a1175994f9c461a8f3ad86a7b4a70d80689825b466122f37fedf4e319b887d24510fe320a24758552cf2942e4cc239fa14688aaaa207cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(monofill.sty) texlive-monofill"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
