SUMMARY = "Babel contributed support for French"
DESCRIPTION = "The package, formerly known as frenchb, establishes French \
conventions in a document (or a subset of the conventions, if \
French is not the main language of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5qsvn66513"

RPM_NAME = "texlive-babel-french-2023.201.3.5qsvn66513-53.1.noarch.rpm"
RPM_HASH = "aec14fdfbc61f4b1ee118fd18263996a7b91da571ec98690fae8e6034223736ab548d31c9df0865b2e5e570f24f4618909b7bddd387689fafdd3163d7e10f760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(acadian.ldf) tex(canadien.ldf) tex(francais.ldf) tex(french.ldf) tex(frenchb.ldf) texlive-babel-french"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
