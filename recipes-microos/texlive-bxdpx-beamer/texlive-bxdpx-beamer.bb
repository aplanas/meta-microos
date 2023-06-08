SUMMARY = "Dvipdfmx extras for use with beamer"
DESCRIPTION = "The package is a driver to support beamer Navigation symbols \
and \\framezoomed regions when using dvipdfmx as PDF generator \
(e.g., as part of e-pTeX). The package does not define any \
'user' commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn41813"

RPM_NAME = "texlive-bxdpx-beamer-2023.201.0.0.3svn41813-52.1.noarch.rpm"
RPM_HASH = "aeec66490c633041f3816df9e7aad45dc14b3d0a11e741fa41231b550b11d4723de260320441be9b2bf0ae3f20c7e68624130638384343255e7311405832e58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxdpx-beamer.sty) texlive-bxdpx-beamer"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
