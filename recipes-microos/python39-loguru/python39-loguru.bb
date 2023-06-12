SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-loguru-0.7.0-2.1.noarch.rpm"
RPM_HASH = "262789203c8dc299127c36a90745f6a246e6bf55bc9b67898693cf6cee78945d62c3d4353da0e3baf45e088b8d7734c8f37700927eb6c643593f8ffd53ad2af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(loguru) python39-loguru python3dist(loguru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
