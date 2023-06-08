SUMMARY = "Documentation for texlive-dozenal"
DESCRIPTION = "This package includes the documentation for texlive-dozenal"
LICENSE = "LPPL-1.0"

PV = "2023.201.7.2svn47680"

RPM_NAME = "texlive-dozenal-doc-2023.201.7.2svn47680-52.1.noarch.rpm"
RPM_HASH = "6749cc366c0d56e66cb58af9701ae38e43107debfdf34baca86ef1ee9def927016fc273872c9b12a88ac2f945699dec5b7640bfdd8cceac73dff58388435b434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dozenal-doc"
RDEPENDS:${PN} += ""

inherit rpm
