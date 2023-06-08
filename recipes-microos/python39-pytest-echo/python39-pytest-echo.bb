SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python39-pytest-echo-1.7.1-1.11.noarch.rpm"
RPM_HASH = "71f2243837619fa48ac66bed5c8f6060d7ce87671dc6ce2a35c428de52a5cd6ded8e5f49c78256560fbd7d6f7d35c6a8c3e3791727c6b7233955b5509ad52d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-echo) python39-pytest-echo python3dist(pytest-echo)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
