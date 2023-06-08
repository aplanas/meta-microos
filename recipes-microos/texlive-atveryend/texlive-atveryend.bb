SUMMARY = "Hooks at the very end of a document"
DESCRIPTION = "This LaTeX packages provides two hooks for \\end{document} that \
are executed after the hook of \\AtEndDocument: \
\\AfterLastShipout can be used for code that is to be executed \
right after the last \\clearpage before the `.aux' file is \
closed. \\AtVeryEndDocument is used for code after closing and \
final reading of the `.aux' file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn53108"

RPM_NAME = "texlive-atveryend-2023.201.1.11svn53108-53.1.noarch.rpm"
RPM_HASH = "d3db9f3072d8ed5a8e0ecb0b8a7e4a0ba4dd8cfd9dd3ae27ea9bd97fe8581a61c7f00cdfe466c930c3b4ed066fdfbb59e415491e8ee62ecc7d7918d676fe4297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(atveryend.sty) texlive-atveryend"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
