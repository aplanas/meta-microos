SUMMARY = "Backport of Python 3.9's pkgutil.resolve_name"
DESCRIPTION = "Backport of Python 3.9's pkgutil.resolve_name which \
resolves a name to an object."
LICENSE = "MIT & Python-2.0"

PV = "1.3.10"

RPM_NAME = "python311-pkgutil-resolve-name-1.3.10-1.3.noarch.rpm"
RPM_HASH = "fe0e8f8b0ffacb103e1c4a6fcbe6bb8d0a6f2f42a1bfa681e2a3bb548fc135aee681c98770cd5bdb773052442870ee7102d8071403d1ad8ee6c2fd75bb16c0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pkgutil-resolve-name) python311-pkgutil-resolve-name python3dist(pkgutil-resolve-name)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
