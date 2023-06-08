SUMMARY = "Babel support for Kurmanji"
DESCRIPTION = "The package provides the language definition file for support \
of Kurmanji in babel. Kurmanji belongs to the family of Kurdish \
languages. Some shortcuts are defined, as well as translations \
to Kurmanji of standard 'LaTeX names'. Note that the package is \
dealing with 'Northern' Kurdish, written using a Latin-based \
alphabet. The arabxetex package offers support for Kurdish \
written in Arabic script."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30279"

RPM_NAME = "texlive-babel-kurmanji-2023.201.1.1svn30279-53.1.noarch.rpm"
RPM_HASH = "4b001a5a8c9d191805368587c4ac77a8414e94ef3346317288c0af109e95e7d79e88dc2828b71eb6e52dc2140ed2fe32837ce6eaa33abff38fd90349a27972eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kurmanji.ldf) texlive-babel-kurmanji"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
