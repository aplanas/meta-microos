SUMMARY = "Documentation for texlive-bithesis"
DESCRIPTION = "This package includes the documentation for texlive-bithesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4.2svn66366"

RPM_NAME = "texlive-bithesis-doc-2023.201.3.4.2svn66366-52.1.noarch.rpm"
RPM_HASH = "59285fba54088e04ab1abc1af4ded184a358806dac2bfff38debf1accb199c844148474ae8fdfe830629de166e54967b1fe8fb971309960c614a2eece0aeded0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bithesis-doc:zh) texlive-bithesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
