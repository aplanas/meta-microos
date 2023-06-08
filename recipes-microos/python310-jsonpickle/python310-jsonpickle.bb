SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-jsonpickle-3.0.1-1.3.noarch.rpm"
RPM_HASH = "76ad381df69ac4542309c9406767a56e2c7b47a87f264d5c3196b3b71103ea964f0e76e9a39400618281bb195ba591a3618cfeff3451b5ed6a1792aa4060bbdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpickle python3.10dist(jsonpickle) python310-jsonpickle python3dist(jsonpickle)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
