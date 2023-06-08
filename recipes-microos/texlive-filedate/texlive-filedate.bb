SUMMARY = "Access and compare info and modification dates"
DESCRIPTION = "The package provides basic access to the date of a LaTeX source \
file according to its \\Provides... entry (the 'info date') as \
well as to its modification date according to \\pdffilemoddate \
if the latter is available."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29529"

RPM_NAME = "texlive-filedate-2023.201.svn29529-52.1.noarch.rpm"
RPM_HASH = "d4415698ff688af593ee1fde2b5cae2ba8aa06680d14d4d7eb216a8221be0e2fa6c51141e8819920f2bb4a8397c73efbbde88cbe7d1fa19eab68683fe8c54416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(filedate.sty) texlive-filedate"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
