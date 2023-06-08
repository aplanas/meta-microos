SUMMARY = "Documentation for texlive-bbold"
DESCRIPTION = "This package includes the documentation for texlive-bbold"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.01svn17187"

RPM_NAME = "texlive-bbold-doc-2023.201.1.01svn17187-53.1.noarch.rpm"
RPM_HASH = "0fbba2cec5bfdfc3ed535ba5f4f1b608265287dca92af459b5fae2859fad9cbedc93b383ceae3c54fd1ece1e63669f47d4a311a26a43e52b31384bd75ab4c6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbold-doc"
RDEPENDS:${PN} += ""

inherit rpm
