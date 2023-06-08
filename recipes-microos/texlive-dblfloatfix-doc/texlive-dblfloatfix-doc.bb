SUMMARY = "Documentation for texlive-dblfloatfix"
DESCRIPTION = "This package includes the documentation for texlive-dblfloatfix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn28983"

RPM_NAME = "texlive-dblfloatfix-doc-2023.201.1.0asvn28983-52.1.noarch.rpm"
RPM_HASH = "e0bd712ba5425a4db1b306bf94cfea554d6603488c4b6e364aac2c6b2141ea7a785825a7bbcc32423cd975b9f1de4db3d5e4569cfedb7c08353c27cf78604df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dblfloatfix-doc"
RDEPENDS:${PN} += ""

inherit rpm
