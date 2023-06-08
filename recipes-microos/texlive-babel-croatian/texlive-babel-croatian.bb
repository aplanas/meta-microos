SUMMARY = "Babel contributed support for Croatian"
DESCRIPTION = "The package establishes Croatian conventions in a document (or \
a subset of the conventions, if Croatian is not the main \
language of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3lsvn35198"

RPM_NAME = "texlive-babel-croatian-2023.201.1.3lsvn35198-53.1.noarch.rpm"
RPM_HASH = "4a287f837fbca04934c5a5905361f4cd50da526cc66094ad47cfb3cee77bfcbc111f3ffbed6d777e3bfdf4a57edfbc5c74bd0b3411c28b745fb1b245ece8410a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(croatian.ldf) texlive-babel-croatian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
