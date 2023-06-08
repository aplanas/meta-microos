SUMMARY = "Support for designing posters on large paper"
DESCRIPTION = "Provides fonts in sizes of 12pt up to 107pt and also makes sure \
that in math formulas the symbols appear in the right size. Can \
also create a PostScript header file for dvips which ensures \
that the poster will be printed in the right size. Supported \
sizes are DIN A0, DIN A1, DIN A2 and DIN A3."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.22bsvn54071"

RPM_NAME = "texlive-a0poster-2023.201.1.22bsvn54071-54.1.noarch.rpm"
RPM_HASH = "80db68287acd6ee91d96d8ef4cbd8af068d6e934b3c7bb0349189e57030cda81431a26524568b7bb10238cd83bf21a9f75e87f71f97513a4eb32c27aa3da1b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(a0poster.cls) tex(a0size.sty) texlive-a0poster"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
