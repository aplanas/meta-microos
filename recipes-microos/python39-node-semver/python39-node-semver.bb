SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-node-semver-0.9.0-1.2.noarch.rpm"
RPM_HASH = "3d1d59332f0c2069c3bac6f85eb88e141ff9394f4947246e048703b93820f549a29018d576829f716229425e4b0da27db701fb6d6a3ac7f31e6c9cccc9fe3aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(node-semver) python39-node-semver python3dist(node-semver)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
