SUMMARY = "Documentation for texlive-nolbreaks"
DESCRIPTION = "This package includes the documentation for texlive-nolbreaks"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn26786"

RPM_NAME = "texlive-nolbreaks-doc-2023.201.1.2svn26786-54.1.noarch.rpm"
RPM_HASH = "71acbaed210c90e5c470c88e8681a7e52ada52716503a7bf359398c1fd9b0a69cf3f106ce39195d4e6bab48a3c3c9b8a972ada15e5f240fdaf1e194012c61c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nolbreaks-doc"
RDEPENDS:${PN} += ""

inherit rpm
