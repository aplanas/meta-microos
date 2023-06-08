SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python39-python-multipart-0.0.5-5.3.noarch.rpm"
RPM_HASH = "6baa64887bc064614e3792cdd909b30560e1fe82599e581c49286519caf248ff5109cd9d4a6179b31d2d2e43aa82a4e4c945447eaeeed8c8f25c98ab46129d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-multipart) python39-python-multipart python3dist(python-multipart)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
