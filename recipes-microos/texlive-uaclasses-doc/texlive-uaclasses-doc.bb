SUMMARY = "Documentation for texlive-uaclasses"
DESCRIPTION = "This package includes the documentation for texlive-uaclasses"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-uaclasses-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "ab7586fdbbed5e01f28e4957089db105f9ca6491074cfdf9d1a3deade308a453a42d4037857e8d38287c20f9eec7f03fa4eed236fd5a9d479d00a10e3765bd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uaclasses-doc"
RDEPENDS:${PN} += ""

inherit rpm
