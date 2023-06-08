SUMMARY = "Astronomical (planetary) symbols"
DESCRIPTION = "Astrosym is a font containing astronomical symbols, including \
those used for the planets, four planetoids, the phases of the \
moon, the signs of the zodiac, and some additional symbols. The \
font is distributed as Metafont source."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.20svn15878"

RPM_NAME = "texlive-astro-2023.201.2.20svn15878-53.1.noarch.rpm"
RPM_HASH = "cbf32f388055d764cf6498f635245ea598e823cb59cb1cb8fdacec0caf5c1dcb8293d052666a3afaddc1e8721324cfcf57b65d20d4092c62ffd71a36bea7cb95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(astrosym.tfm) texlive-astro"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
