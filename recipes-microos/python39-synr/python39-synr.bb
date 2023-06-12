SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python39-synr-0.6.0-1.6.noarch.rpm"
RPM_HASH = "4d89eafd187a3480c4250dfcc15267adad4cf2f357b15f1993b1e9f857752ab341bac6b12095d1971abcd3c37b50196f11e93de998fa84fa7d07da267dde5662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(synr) \
python39-synr \
python3dist(synr)"
RDEPENDS:${PN} += "python(abi) \
python39-attrs"

inherit rpm
