SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-docker-pycreds-0.4.0-1.15.noarch.rpm"
RPM_HASH = "82244de0baa83745ff2d7ad7824a96bdbac174129f50bde0e867005125dff451f1347b95c248fe9e8b7200ce4a5b56d681689f4475cf74cc0c38c8f1bb4f8cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docker-pycreds) python311-docker-pycreds python3dist(docker-pycreds)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
