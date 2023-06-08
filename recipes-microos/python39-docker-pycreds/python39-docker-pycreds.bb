SUMMARY = "Python bindings for the Docker credentials store API"
DESCRIPTION = "This package contains the Python bindings for the Docker credentials \
store API."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-docker-pycreds-0.4.0-1.15.noarch.rpm"
RPM_HASH = "fafdc7bb8fd04f6987824577f8ccf0f194559a17660863a475f4e9d9a1a6d6b0226d98625e6eab10ecca620bf3ae37c5fe2343baee48fae47356f7a7d95f7a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docker-pycreds) python39-docker-pycreds python3dist(docker-pycreds)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
