SUMMARY = "User documentation for AMS document classes"
DESCRIPTION = "This collection comprises a set of four manuals, or Author \
Handbooks, each documenting the use of a class of publications \
based on one of the AMS document classes amsart, amsbook, \
amsproc and one 'hybrid', as well as a guide to the generation \
of the four manuals from a coordinated set of LaTeX source \
files. The Handbooks comprise the user documentation for the \
pertinent document classes. As the source for the Handbooks \
consists of a large number of files, and the intended output is \
multiple different documents, the principles underlying this \
collection can be used as a model for similar projects. The \
manual 'Compiling the AMS Author Handbooks' provides \
information about the structure of and interaction between the \
various components."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46110"

RPM_NAME = "texlive-amscls-doc-2023.201.svn46110-54.1.noarch.rpm"
RPM_HASH = "73c57c7028df3e55569470ee1b490ffe186d5c389d47e8d9f2fb9a0836eac79f455f53a2400338e484ecdd1cff35fa482134d69583d4c6bc679a995b9c295788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amscls-doc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
