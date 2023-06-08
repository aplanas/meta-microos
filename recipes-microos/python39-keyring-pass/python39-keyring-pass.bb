SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-keyring-pass-0.7.1-1.3.noarch.rpm"
RPM_HASH = "0ebb3dd35ce39cb75aa99847a75b0731783aedee5eec6824f73252557967e013e1507dad4fe2f5682b24bad7e7cba938fc90e3566a148ff4101b91e452e474aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(keyring-pass) python39-keyring-pass python3dist(keyring-pass)"
RDEPENDS:${PN} += "python(abi) python39-jaraco.classes python39-keyring"

inherit rpm
