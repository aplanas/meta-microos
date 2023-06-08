SUMMARY = "Backport of Python 3.9's pkgutil.resolve_name"
DESCRIPTION = "Backport of Python 3.9's pkgutil.resolve_name which \
resolves a name to an object."
LICENSE = "MIT & Python-2.0"

PV = "1.3.10"

RPM_NAME = "python39-pkgutil-resolve-name-1.3.10-1.3.noarch.rpm"
RPM_HASH = "154dbbe4b161ec63bc8fd1881e5ce438f8d6a854629defac75d8888d1f080601cd2325785d4f6ff148659470011e47f95c518527e54e71ed72a7820d309ef243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pkgutil-resolve-name) python39-pkgutil-resolve-name python3dist(pkgutil-resolve-name)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
