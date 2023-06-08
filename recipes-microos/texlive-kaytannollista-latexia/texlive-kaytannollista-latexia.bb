SUMMARY = "Practical manual for LaTeX (Finnish)"
DESCRIPTION = "'Kaytannollista Latexia' is a practical manual for LaTeX \
written in the Finnish language. The manual covers most of the \
topics that a typical document author needs. So it can be a \
useful guide for beginners as well as a reference manual for \
advanced users."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023svn65461"

RPM_NAME = "texlive-kaytannollista-latexia-2023.201.2023svn65461-55.1.noarch.rpm"
RPM_HASH = "8e70bcbcc763c754240414e163eb0e13ef1e60d763f1a419f0b326a9f3e4b10848f514d4a6452a43f08b071942d7a4f4b4e5838a80b67f1883de2ee8d14cf95c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kaytannollista-latexia"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
