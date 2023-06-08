SUMMARY = "Babel contributed support for Dutch"
DESCRIPTION = "The package provides a language definition, file for use with \
babel, which establishes Dutch conventions in a document (or a \
subset of the conventions, if Dutch is not the main language of \
the document)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.8lsvn60362"

RPM_NAME = "texlive-babel-dutch-2023.201.3.8lsvn60362-53.1.noarch.rpm"
RPM_HASH = "2f56b52454d4f7cdea0beb00324de402f6489b49051563615f92a25bcb2a6f4bf89488d11da698dba13199866f36dd756300e1fe5b10e5d07b812976c7c66de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(afrikaans.ldf) tex(dutch.ldf) texlive-babel-dutch"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
