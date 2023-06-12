SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pytest-sphinx-0.5.0-1.1.noarch.rpm"
RPM_HASH = "442b4aa5600821f244b4d415b14d95e9aab9a918349312b06cef15325a732532ba6e32168abf2b9ddca82cbc3de897db24c7dd5193707e36b1c938d786430ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-sphinx) python39-pytest-sphinx python3dist(pytest-sphinx)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
