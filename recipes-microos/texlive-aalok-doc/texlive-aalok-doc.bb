SUMMARY = "Documentation for texlive-aalok"
DESCRIPTION = "This package includes the documentation for texlive-aalok"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn61719"

RPM_NAME = "texlive-aalok-doc-2023.201.0.0.6svn61719-54.1.noarch.rpm"
RPM_HASH = "979d8d1248dacbf4d2b16a4294f766a8fe34de9bde986b6c1ad9d37694a040b7b926dd1313bb686d0d3f2449bd2321d7fbe8aab5769ecb918f96053da24d843b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-aalok-doc:mr) texlive-aalok-doc"
RDEPENDS:${PN} += ""

inherit rpm
