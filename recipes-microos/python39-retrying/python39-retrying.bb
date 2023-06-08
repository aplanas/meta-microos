SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "python39-retrying-1.3.4-1.3.noarch.rpm"
RPM_HASH = "f12770466476fe342521c6b11a23643a31501c54d663b029e032a8e8739eb2bdcc90fac9aa59dbdf1407788050757ed69ccdb5fcb06f26576908e7478a90af28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(retrying) python39-retrying python3dist(retrying)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
