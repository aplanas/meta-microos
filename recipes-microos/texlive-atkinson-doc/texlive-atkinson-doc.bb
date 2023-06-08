SUMMARY = "Documentation for texlive-atkinson"
DESCRIPTION = "This package includes the documentation for texlive-atkinson"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64385"

RPM_NAME = "texlive-atkinson-doc-2023.201.svn64385-53.1.noarch.rpm"
RPM_HASH = "f3b4709c7e6a48aa7ba82bc4b442cc85aa956b3a94d83c145f35f2afbe57f483f74cfa3db4215f89d7bb393b2a4f5f8eb9a1c47277d9dd38199278e39e0c6cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atkinson-doc"
RDEPENDS:${PN} += ""

inherit rpm
