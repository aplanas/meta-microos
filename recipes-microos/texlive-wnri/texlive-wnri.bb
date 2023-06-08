SUMMARY = "Ridgeway's fonts"
DESCRIPTION = "Fonts (as Metafont source) for Old English, Indic languages in \
Roman transliteration and Puget Salish (Lushootseed) and other \
Native American languages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22459"

RPM_NAME = "texlive-wnri-2023.201.svn22459-53.1.noarch.rpm"
RPM_HASH = "d48b3f16829e0c4adbc1badeeab5336829a2c9ef0aa6275c620d9eb2b023c73e91dcf39155d3865fb93f8efe75519378c94c1479b8132e918efae7a0841a1ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wnindic.map) tex(wnrib10.tfm) tex(wnrib8.tfm) tex(wnribi10.tfm) tex(wnrii10.tfm) tex(wnrii8.tfm) tex(wnrir10.tfm) tex(wnrir8.tfm) tex(wnris10.tfm) tex(wnris8.tfm) tex(wnrit10.tfm) tex(wnrit8.tfm) texlive-wnri"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
