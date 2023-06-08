SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-pytest-sphinx-0.4.0-1.5.noarch.rpm"
RPM_HASH = "8ae98fa72ff879de063f9ca7df753cd5d1586c1f766edbbc86be1ff43f827aec994daa488b5994bf9039cfdf9cce364649cfc85946aaa8cd9a93f191cf3a8281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-sphinx) python39-pytest-sphinx python3dist(pytest-sphinx)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
