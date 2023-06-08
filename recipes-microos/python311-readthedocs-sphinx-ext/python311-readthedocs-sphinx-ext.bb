SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-readthedocs-sphinx-ext-2.2.0-2.1.noarch.rpm"
RPM_HASH = "20b23318470cf1af52ad280f86952c766b66f58aa10497e37d1ca024dd075aecf4b93b10859ac17582f526d08e5fd41fd0664244df5ae83e5759c081dbe83796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(readthedocs-sphinx-ext) python311-readthedocs-sphinx-ext python3dist(readthedocs-sphinx-ext)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-requests"

inherit rpm
