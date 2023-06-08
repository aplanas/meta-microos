SUMMARY = "Helper to test WSGI applications - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebTest."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python-WebTest-doc-3.0.0-3.1.noarch.rpm"
RPM_HASH = "a6e92f2eb69e418162060e13bf098c877189e9ddf7e074bb33790d0d15535357a404354d5f3839954989e35adc5ee7cf5529393c6a300a80fa7e5c5bfbd73c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebTest-doc python310-WebTest-doc python311-WebTest-doc python39-WebTest-doc"
RDEPENDS:${PN} += ""

inherit rpm
