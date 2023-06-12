SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python311-pytest-echo-1.7.1-1.11.noarch.rpm"
RPM_HASH = "dfdb5c6f2709fc7c9257371b927ef43a6e9056d9e2235d88f9ad7c3abb48a59dba6306a2ff4f9608aa9b97ef3f719b29ba71175fb3ed68bd5a6e16d7b81b81fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-echo) \
python311-pytest-echo \
python3dist(pytest-echo)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
