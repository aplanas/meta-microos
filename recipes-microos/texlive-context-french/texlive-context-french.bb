SUMMARY = "Support for writing French in ConTeXt"
DESCRIPTION = "Deals with spacing around French punctuation; the package is \
distributed for ConTeXt Mark IV only."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn54215"

RPM_NAME = "texlive-context-french-2023.204.svn54215-54.1.noarch.rpm"
RPM_HASH = "7510e93362418607ecb042fa63d201a2d74f9fec0580f129b648843ca5e31bab784b42b878f4f3d6db305d14ea4ef764b8765d7a54198c07dba59c061ee3fb90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-french"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
