SUMMARY = "Interface to the Akismet Anti Comment-Spam API"
DESCRIPTION = "A Python interface to the Akismet anti comment-spam API."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-akismet-1.2.1-1.4.noarch.rpm"
RPM_HASH = "8a4f52dd317320f28dbda40ac94a7f46bd915be6f3a0b1253cdcd4f776443df93c6c8702b8806d3e4581ddebbc6daf9c976d67f8c28b3c8ce810b4c2f2434e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(akismet) \
python311-akismet \
python3dist(akismet)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
