SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python39-setuptools-version-command-99.9-1.3.noarch.rpm"
RPM_HASH = "e88a46937b14a23827f7ad64901988d96ffc56de4a44a1a40bc1067b2c59bde14a0c7e7efd721a018b9a09ca14b84746ab96296d26f55513b4a5c7ca9c285921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-version-command) python39-setuptools-version-command python3dist(setuptools-version-command)"
RDEPENDS:${PN} += "python(abi) python39-setuptools"

inherit rpm
