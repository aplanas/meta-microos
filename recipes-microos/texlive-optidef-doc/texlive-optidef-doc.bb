SUMMARY = "Documentation for texlive-optidef"
DESCRIPTION = "This package includes the documentation for texlive-optidef"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn50941"

RPM_NAME = "texlive-optidef-doc-2023.201.3.1svn50941-54.1.noarch.rpm"
RPM_HASH = "99b311bdc9de17fccef87c7b2bff51d0f66fb3f27ed3526022f23eaad1863596beac5cd136866e944cdf25defb240375291d3929916eee71317cbbdeb2661b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optidef-doc"
RDEPENDS:${PN} += ""

inherit rpm
