SUMMARY = "Section numbers with trailing dots"
DESCRIPTION = "Makes the numbers of \\section commands come out with a trailing \
dot. Includes a command whereby the same can be made to happen \
with other sectioning commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20208"

RPM_NAME = "texlive-secdot-2023.201.1.0svn20208-53.1.noarch.rpm"
RPM_HASH = "7463b5cccec152bb0d99d231a88836c923a54c5e83e445f077e514e29a4158c5f427bcb04cb36c178af3050ace0f421817bafa871457a2747dc4e4bc5aed1e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(secdot.sty) texlive-secdot"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
