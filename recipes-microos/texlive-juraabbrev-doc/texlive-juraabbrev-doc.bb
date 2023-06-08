SUMMARY = "Documentation for texlive-juraabbrev"
DESCRIPTION = "This package includes the documentation for texlive-juraabbrev"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-juraabbrev-doc-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "08fe2b995e60acd5eff44430637e9e4558736f35ee288c5dafbd669bf35af51b5b3a9e80676887d06b49fc7ae2d6cf8c5c8b1fd3e8cfbcf18d19abda3e4a5301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-juraabbrev-doc:de) texlive-juraabbrev-doc"
RDEPENDS:${PN} += ""

inherit rpm
