SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python39-jschema-to-python-1.2.3-1.6.noarch.rpm"
RPM_HASH = "9d8f3d9791c5201d22e32bfd4d119dfe0802c3c54f585293a4abcda1341b8bc95808fa55bc03528e9d06761cbcc419722e55a4313d1190be5ae94f1c56507d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jschema-to-python) python39-jschema-to-python python3dist(jschema-to-python)"
RDEPENDS:${PN} += "python(abi) python39-attrs python39-jsonpickle python39-pbr"

inherit rpm
