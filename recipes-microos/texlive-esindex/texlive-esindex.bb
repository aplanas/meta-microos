SUMMARY = "Typset index entries in Spanish documents"
DESCRIPTION = "This package helps you to create indexes in Spanish. With \
esindex you can write, say, \\esindex{canon} and the entry will \
be correctly alphabetized in the index. This release of esindex \
works with accented characters in any encoding, and without \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn52342"

RPM_NAME = "texlive-esindex-2023.201.1.7svn52342-53.1.noarch.rpm"
RPM_HASH = "c07ec6c9430fc380221d26e863c2b31dea3259e84da0d723b138834efe0aa7d632ba03e5499a7bfa7fc004480358175991083f7047f2fc4bcbce7aa41f80a60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(esindex.sty) texlive-esindex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
