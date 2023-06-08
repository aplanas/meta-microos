SUMMARY = "Documentation for texlive-xetex-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-xetex-pstricks"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17055"

RPM_NAME = "texlive-xetex-pstricks-doc-2023.201.svn17055-52.1.noarch.rpm"
RPM_HASH = "57da06eb9327ec0697e5cc550e9bde4648f700dfc1a904c6205220e2fa94ab94f851e35b79cfcd4751a847baa9967d691dbc9e36c8ad4bd8f4832a2c4b2f511e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks-doc"
RDEPENDS:${PN} += ""

inherit rpm
