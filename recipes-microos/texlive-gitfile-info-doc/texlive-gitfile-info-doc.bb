SUMMARY = "Documentation for texlive-gitfile-info"
DESCRIPTION = "This package includes the documentation for texlive-gitfile-info"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-doc-2023.201.0.0.5svn51928-53.1.noarch.rpm"
RPM_HASH = "fba56e5997fe5b990f54441164f05295f0767960e70d063f55cec6ed5b833b1e94548b76de9b9334690d731b64af77aa0199c0ff3035e046b2555eb8d124263e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitfile-info-doc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
