SUMMARY = "Experimental bidi-aware text highlighting"
DESCRIPTION = "Experimental bidi-aware text highlighting."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn37795"

RPM_NAME = "texlive-bidihl-2023.201.0.0.1csvn37795-53.1.noarch.rpm"
RPM_HASH = "02d17dc2c8c6cec1b2017f83b9ce138c969b478310753cb850ed20e43b2c4bb4e639219c678cdcf4bed5d8fe35194922e2ab63d2b4f13506d7216cfb08348005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bidihl.sty) texlive-bidihl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
