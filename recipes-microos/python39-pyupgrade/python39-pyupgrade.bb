SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python39-pyupgrade-3.4.0-1.1.noarch.rpm"
RPM_HASH = "a743d4a994b53f8e4dec3adfb62b1fe2196f9075e0e48160749e702e67c5557272526096183d8396b485cb9756941b8c63b2019ee0d6f95cca4b9e11e0a0a30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyupgrade) \
python39-pyupgrade \
python3dist(pyupgrade)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-tokenize-rt \
update-alternatives"

inherit rpm
