SUMMARY = "Compute the mass of a printed version of a document"
DESCRIPTION = "The package computes the number of sheets of paper used by, and \
hence the mass of a document. This is useful (for example) when \
calculating postal charges."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn23667"

RPM_NAME = "texlive-papermas-2023.201.1.0hsvn23667-51.1.noarch.rpm"
RPM_HASH = "ec53620b28cef116d8571b1d8d6b56e6f2a618b8c91c4ec264eab8b297c61fd1645642d1762c8486300e75d37efa6f1c5631e5cd369ca1d0c7bcbd80386baa14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(papermas.sty) texlive-papermas"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(intcalc.sty) tex(kvoptions.sty) tex(pageslts.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
