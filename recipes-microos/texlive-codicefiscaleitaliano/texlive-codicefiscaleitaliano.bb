SUMMARY = "Test the consistency of the Italian personal Fiscal Code"
DESCRIPTION = "The alphanumeric string that forms the Italian personal Fiscal \
Code is prone to be misspelled thus rendering a legal document \
invalid. The package quickly verifies the consistency of the \
fiscal code string, and can therefore be useful for lawyers and \
accountants that use fiscal codes very frequently."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn29803"

RPM_NAME = "texlive-codicefiscaleitaliano-2023.201.1.2svn29803-53.1.noarch.rpm"
RPM_HASH = "4b08ace676e6048d843e9624a9f39d5128de25ed76bb8e2e68f00b40e0221c03451bfa3b773ec6992651144e9ad6d180339c172553b07e0933f3e402b33b9088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(codicefiscaleitaliano.sty) texlive-codicefiscaleitaliano"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
