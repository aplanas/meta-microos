SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-docker-pycreds-0.4.0-1.15.noarch.rpm"
RPM_HASH = "2547c97974a516de2fd585850a502def03a7d1d196d5520fcecba8d7537ab1d4a7ac27b49c9e8dd9c0e41accbd7ddb8e85b8b8cfea797f0e6b8821710b3837dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker-pycreds python3.10dist(docker-pycreds) python310-docker-pycreds python3dist(docker-pycreds)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
