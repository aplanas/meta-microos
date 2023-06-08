SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "0.8.1"

RPM_NAME = "python39-resolvelib-0.8.1-7.1.noarch.rpm"
RPM_HASH = "0c10d36e6ba00d5d0947826b3f08416faaa6880fdd28b41d95accb7b3c108a7a942d7bb47b48ca584f6c71f37b0102f0cbd15aa8bd98cbb1ef61e6d11616a7b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(resolvelib) python39-resolvelib python3dist(resolvelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
