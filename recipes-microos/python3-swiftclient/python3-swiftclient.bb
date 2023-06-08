SUMMARY = "OpenStack Object Storage API Client Library"
DESCRIPTION = "This is a python client for the Swift API. There's a Python API (the \
swiftclient module), and a command-line script (swift). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python3-swiftclient-4.1.0-1.3.noarch.rpm"
RPM_HASH = "de30a4ab4348cc5359eb24f80e3a848ada95509508ce3dcb8a4bf0745226bc56dd357ede1e422d985f93925a91d8255eaf6fe7df8b043c7b3a21e4c489f34651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swiftclient python3.10dist(python-swiftclient) python3dist(python-swiftclient)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-requests"

inherit rpm
