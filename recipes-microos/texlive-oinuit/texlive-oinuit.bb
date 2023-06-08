SUMMARY = "LaTeX Support for the Inuktitut Language"
DESCRIPTION = "The package provides a set of Lambda (Omega LaTeX) typesetting \
tools for the Inuktitut language. Five different input methods \
are supported and with the necessary fonts are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28668"

RPM_NAME = "texlive-oinuit-2023.201.svn28668-54.1.noarch.rpm"
RPM_HASH = "eb28f6c34264a0fe994e36f2d1218be1c91443760b7e0b1efb01116d4db53cb6602fa998d64f766f456be47eb50437e8364d792d804a4a454e7695fdb987551e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Inuit.tfm) tex(Inuitb.tfm) tex(Inuitbo.tfm) tex(Inuito.tfm) tex(litcmr.fd) tex(litenc.def) tex(oinuit.map) tex(oinuit.sty) texlive-oinuit"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-oinuit-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
