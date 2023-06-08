SUMMARY = "Documentation for texlive-besjournals"
DESCRIPTION = "This package includes the documentation for texlive-besjournals"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45662"

RPM_NAME = "texlive-besjournals-doc-2023.201.svn45662-53.1.noarch.rpm"
RPM_HASH = "79c143f2e0ce48ab03787b4fe6e339b689e78c71ca32b58ac225645da11f0be31947a70555aef11bba38ad35dc1ecb02a5a8c71b972b2131655e1f8f02a276aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-besjournals-doc"
RDEPENDS:${PN} += ""

inherit rpm
