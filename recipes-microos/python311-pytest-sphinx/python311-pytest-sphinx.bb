SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-pytest-sphinx-0.4.0-1.5.noarch.rpm"
RPM_HASH = "73d1e5a2a74a03ecceeb898878e316785c7b4e253575abc67a9d18127ff95a77b91a459507b0ee6fa233eac820e100711913e6fbf76103d2244b646c8393e6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-sphinx) python311-pytest-sphinx python3dist(pytest-sphinx)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
