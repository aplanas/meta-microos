SUMMARY = "Documentation for texlive-multiobjective"
DESCRIPTION = "This package includes the documentation for texlive-multiobjective"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-multiobjective-doc-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "6e64d80abc0635636e02ac99e94bb06a55671ffa88b951ed5395affded1563769db1fd4a9da48e56823f7da75e596adb855398f5f44fc386d205e1cdede79a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiobjective-doc"
RDEPENDS:${PN} += ""

inherit rpm
