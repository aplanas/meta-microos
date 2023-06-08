SUMMARY = "Reorder frames in the PDF file"
DESCRIPTION = "The package provides a method to reorder frames in the PDF file \
without reordering the source. Its principal use is to embed or \
append frames with details on some subject. The author \
describes the package as 'experimental'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn23510"

RPM_NAME = "texlive-beamersubframe-2023.201.0.0.2svn23510-53.1.noarch.rpm"
RPM_HASH = "b6bf61aaa57c8e5f9b3bca8ffc52362c4c581b467f4bd034c5d43c243d0482f41fca2d92945c171bcb51526b475a1f05bd1a0090e0fc44dcbb3d960f277afb6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamersubframe.sty) texlive-beamersubframe"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(verbatim.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
