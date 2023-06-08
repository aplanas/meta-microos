SUMMARY = "Documentation for texlive-ducksay"
DESCRIPTION = "This package includes the documentation for texlive-ducksay"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn64655"

RPM_NAME = "texlive-ducksay-doc-2023.201.2.6svn64655-52.1.noarch.rpm"
RPM_HASH = "61aa136bb47e8c2744af991eb5888bde66134903dfa95b2bd7b790ff4346831adc27ce0b3b1fa20c3f23a69c37010c2d93b55fe35c88533cc1b130f95fac2695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ducksay-doc"
RDEPENDS:${PN} += ""

inherit rpm
