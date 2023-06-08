SUMMARY = "Documentation for texlive-syllogism"
DESCRIPTION = "This package includes the documentation for texlive-syllogism"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-syllogism-doc-2023.201.1.2svn15878-57.1.noarch.rpm"
RPM_HASH = "0eed5e3200fd7a0db84275879762e62455314a180897fdc1d9efa6682a8a7468a0e8580db6cc3c3b31ec0e95bee7256dcf44ad1978c2948a041f9d71d0d55c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syllogism-doc"
RDEPENDS:${PN} += ""

inherit rpm
