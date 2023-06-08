SUMMARY = "Fancy section separators"
DESCRIPTION = "This package provides fancy separators, which are visual cues \
that indicate a change of subject or context without actually \
starting a new chapter or section."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn59103"

RPM_NAME = "texlive-froufrou-2023.201.1.4.0svn59103-52.1.noarch.rpm"
RPM_HASH = "896ff4abdf1d930086edf30abade0d4736474e20e448e4066aeaf89eff0c73d02fe5f6873363dfab8da0e0d80096791e6e2cf568d983188be4f79b935948aaed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(froufrou.sty) texlive-froufrou"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(expl3.sty) tex(fourier-orns.sty) tex(tikz.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
