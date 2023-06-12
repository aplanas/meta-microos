SUMMARY = "Documentation for texlive-hitszthesis"
DESCRIPTION = "This package includes the documentation for texlive-hitszthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-doc-2023.201.3.2.1svn61073-53.1.noarch.rpm"
RPM_HASH = "0a11e0356d721d8967db8d76a3c6d38f499ca35519be84a353ad04dfed911d266cdd17b52459604cb3e0017f60a1477847650144877f81092450db10e93c7434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hitszthesis-doc:zh) \
texlive-hitszthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
