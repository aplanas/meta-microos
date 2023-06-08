SUMMARY = "Documentation for texlive-autoaligne"
DESCRIPTION = "This package includes the documentation for texlive-autoaligne"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn56966"

RPM_NAME = "texlive-autoaligne-doc-2023.201.1.5svn56966-53.1.noarch.rpm"
RPM_HASH = "bb0ca667a6e4f48afe02c037dbb8e24d92310c4eb6c502382f84c5f389f0e3a2756c6c88595ff13b0d57f05a2e27ebd204bf4bae2e995635ee50876ac961479b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-autoaligne-doc:fr) texlive-autoaligne-doc"
RDEPENDS:${PN} += ""

inherit rpm
