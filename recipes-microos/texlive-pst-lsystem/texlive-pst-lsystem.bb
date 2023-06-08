SUMMARY = "Create images based on a L-system"
DESCRIPTION = "pst-lsystem is a PSTricks based package for creating images \
based on a L-system. A L-system (Lindenmayer system) is a set \
of rules which can be used to model the morphology of a variety \
of organisms or fractals like the Kochflake or Hilbert curve."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn49556"

RPM_NAME = "texlive-pst-lsystem-2023.201.0.0.02svn49556-52.1.noarch.rpm"
RPM_HASH = "343a42cf38f69f5e1989388270df33786e75f37cea84e32f61b3506bcfc4f776c3b54d57b8575f28d24fc8db87322e53eebbd444f791cfc0cc14f2bf78561181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-lsystem.sty) tex(pst-lsystem.tex) texlive-pst-lsystem"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
