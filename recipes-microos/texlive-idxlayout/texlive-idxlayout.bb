SUMMARY = "Configurable index layout, responsive to KOMA-Script and memoir"
DESCRIPTION = "The idxlayout package offers a key-value interface to configure \
index layout parameters, e.g. allowing for three-column indexes \
or for 'parent' items and their affiliated subitems being \
typeset as a single paragraph. The package is responsive to the \
index-related options and commands of the KOMA-Script and \
memoir classes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-2023.201.0.0.4dsvn25821-52.1.noarch.rpm"
RPM_HASH = "b1a01628ab0109a424c5a96a4af77b88c61c29f3521e0bfaa2a450af30e43318ed955e0e48f4f33fded4b47e1ad800143cb9d833cd2413c28f7317097a3574f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(idxlayout.sty) texlive-idxlayout"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(kvoptions.sty) tex(multicol.sty) tex(ragged2e.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
