SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python39-aniso8601-9.0.1-1.10.noarch.rpm"
RPM_HASH = "b4e48812bb700cf625603443e8dd3fd50749f3c6ee8e41a64c79ea79733fac679af6734a09dbdb16662eadf317498ce0eb4d84bf8c254030326044b4b1543e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aniso8601) python39-aniso8601 python3dist(aniso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
