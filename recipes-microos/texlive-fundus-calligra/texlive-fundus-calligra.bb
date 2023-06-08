SUMMARY = "Support for the calligra font in LaTeX documents"
DESCRIPTION = "The package offers support for the calligra handwriting font, \
in LaTeX documents. The package is part of the fundus bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn26018"

RPM_NAME = "texlive-fundus-calligra-2023.201.1.2svn26018-52.1.noarch.rpm"
RPM_HASH = "d0a3bc6dce9f9969f827716c28db7eaaf409695b6f3d4eee126c3c7d0b362962fd45c6f4a99238101c564ab4b0da9f8594b7072ed5d3b27e810a166ec23d351c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(calligra.sty) texlive-fundus-calligra"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
