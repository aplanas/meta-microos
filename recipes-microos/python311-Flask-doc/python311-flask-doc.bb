SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python311-Flask-doc-2.2.2-2.1.noarch.rpm"
RPM_HASH = "31166b19cd8216ee9e7fd2c199eb0c4ed5ac4206be6845fd64730c81ae5ea221867b3e97e9b40cc6ff77af7d91445f347bb670eed4c8ca0d8c9228ccde6ca05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Flask-doc"
RDEPENDS:${PN} += "python311-Flask"

inherit rpm
