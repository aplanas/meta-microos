SUMMARY = "If-then-else command for processing potentially empty arguments"
DESCRIPTION = "This package provides a command for the LaTeX programmer for \
testing whether an argument is empty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn47544"

RPM_NAME = "texlive-ifmtarg-2023.201.1.2bsvn47544-52.1.noarch.rpm"
RPM_HASH = "3d67a01fbb412439576038a229b835f5380614ba81ab6be31fe25234dd58280f68cd1f56cedeb27d7ef8d2b2bc380d881d4bc5b1c7f5185290f7edfc178edbd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifmtarg.sty) texlive-ifmtarg"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
