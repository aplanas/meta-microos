SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-pytest-sphinx-0.4.0-1.5.noarch.rpm"
RPM_HASH = "18e29ad2cbe14de27004b32452148c4840140c99aa28b09582bad22f2b0ec4aefec5394c286d609de80e5c0ea5c51ff0a9ec29bc6f504169ad94b15b95468fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sphinx python3.10dist(pytest-sphinx) python310-pytest-sphinx python3dist(pytest-sphinx)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
