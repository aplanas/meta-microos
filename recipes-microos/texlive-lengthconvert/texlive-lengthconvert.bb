SUMMARY = "Express lengths in arbitrary units"
DESCRIPTION = "The package provides a command to convert a length to any of a \
large selection of units. The package relies on the LaTeX3 \
programming environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn55064"

RPM_NAME = "texlive-lengthconvert-2023.201.1.0asvn55064-54.1.noarch.rpm"
RPM_HASH = "bc4e71d98e6ef576c63dc2086dfb3e460ee7c7ea4fb037f79966b4ec448b81b69d879ca8a0bf0c9db72ddecfe6052d441ed46e56474d6f2dabff1f30df37ae86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lengthconvert.sty) texlive-lengthconvert"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
