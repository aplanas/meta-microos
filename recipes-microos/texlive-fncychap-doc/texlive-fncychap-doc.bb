SUMMARY = "Documentation for texlive-fncychap"
DESCRIPTION = "This package includes the documentation for texlive-fncychap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn20710"

RPM_NAME = "texlive-fncychap-doc-2023.201.1.34svn20710-52.1.noarch.rpm"
RPM_HASH = "a71fee192f8db0bea541d934336677c3699c8cb211cadc677fb2a3660aab03d4c3c42ed5fb8a613ddacadaed8d6d80d68c14718e64b24a7b2cc820b5b8557ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fncychap-doc"
RDEPENDS:${PN} += ""

inherit rpm
