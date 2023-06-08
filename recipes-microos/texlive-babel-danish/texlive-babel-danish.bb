SUMMARY = "Babel contributed support for Danish"
DESCRIPTION = "The package provides a language definition, file for use with \
babel, which establishes Danish conventions in a document (or a \
subset of the conventions, if Danish is not the main language \
of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3ssvn57642"

RPM_NAME = "texlive-babel-danish-2023.201.1.3ssvn57642-53.1.noarch.rpm"
RPM_HASH = "55beaf3e5b711cba5a1aeaddb9cea3ac728373fbaa3a765b6b0ca3f4629d46fa568864cc2c59a9d2880a817dc260183efb069b8c5d339f0b7b2a500d7ecafdc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(danish.ldf) texlive-babel-danish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
