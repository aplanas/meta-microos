SUMMARY = "German letter DIN style"
DESCRIPTION = "Implements a document layout for writing letters according to \
the rules of DIN (Deutsches Institut fur Normung, German \
standardisation institute). A style file for LaTeX 2.09 (with \
limited support of the features) is part of the package. Since \
the letter layout is based on a German standard, the user guide \
is written in German, but most macros have English names from \
which the user can recognize what they are used for. In \
addition there are example files showing how letters may be \
created with the package. A graphical interface for use of the \
dinbrief is provided in the dinbrief-GUI bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-dinbrief-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "1d95dc74c76f1ac24a9ad0f82b045384aa0ac04317399f18788090c69c46878e700c260e20e74c2e89a63493943860194a5b0f4f00b41c7b4f5d8f4791f0693a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dinbrief.cfg) tex(dinbrief.cls) tex(dinbrief.sty) texlive-dinbrief"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
