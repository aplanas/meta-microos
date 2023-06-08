SUMMARY = "Documentation for texlive-xepersian-hm"
DESCRIPTION = "This package includes the documentation for texlive-xepersian-hm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-doc-2023.201.1.1asvn56272-52.1.noarch.rpm"
RPM_HASH = "7ec4e768ea938a2f99533b880718eea104f64b8a9be3282a118dae1bf58f8b38325dc7b856d7e354830e408bfcbd37193aaf5eb8ee444bfc9b6040e3682c36f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xepersian-hm-doc:fa) texlive-xepersian-hm-doc"
RDEPENDS:${PN} += ""

inherit rpm
