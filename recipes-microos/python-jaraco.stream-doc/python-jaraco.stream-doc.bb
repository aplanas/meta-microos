SUMMARY = "Documentation files for python-jaraco.stream"
DESCRIPTION = "This package contains documentation files for python-jaraco.stream."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python-jaraco.stream-doc-3.0.3-1.6.noarch.rpm"
RPM_HASH = "5f8185dc556429ce09419f748ed5a4c07571fc1e57b642da2459d1e48a65707655623fd5a5d6f91a787f85e9ebe19dbab6af87b91060fb397aedae49fc48d76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-jaraco.stream-doc python310-jaraco.stream-doc python311-jaraco.stream-doc python39-jaraco.stream-doc"
RDEPENDS:${PN} += ""

inherit rpm
