SUMMARY = "Documentation for texlive-ipaex"
DESCRIPTION = "This package includes the documentation for texlive-ipaex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-ipaex-doc-2023.201.svn61719-55.1.noarch.rpm"
RPM_HASH = "ca05b22387234b89056a86acd11e3b8a55f5a7811d7bc26b5478372bd259aea3eabc9b9ed7abc6cc1531892ebb60f1afbe48bc89f19f0c1c860330fc1cda558c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipaex-doc"
RDEPENDS:${PN} += ""

inherit rpm
