SUMMARY = "Shell scripts interfacing to pdfpages"
DESCRIPTION = "The package makes available the pdfjam shell script that \
provides a simple interface to much of the functionality of the \
excellent pdfpages package (by Andreas Matthias) for LaTeX. The \
pdfjam script takes one or more PDF files (and/or JPG/PNG \
graphics files) as input, and produces one or more PDF files as \
output. It is useful for joining files together, selecting \
pages, reducing several source pages onto one output page, \
etc., etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.03svn56991"

RPM_NAME = "texlive-pdfjam-2023.201.3.03svn56991-51.1.noarch.rpm"
RPM_HASH = "0a671cfe7561a6f3c630b462e34e3bbdced3e41f642a5d9625f6188523da616ce51be9de4fa4e56dfd90a932a8f3c793a9a128e597687135856f6b125b13c2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfjam"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-pdfjam-bin texlive-pdfpages texlive-scripts texlive-scripts-bin"

inherit rpm
