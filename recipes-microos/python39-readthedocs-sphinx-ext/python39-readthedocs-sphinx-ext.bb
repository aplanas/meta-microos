SUMMARY = "Sphinx extension for Read the Docs overrides"
DESCRIPTION = "This module adds extensions that make Sphinx easier to use. \
Some of them require Read the Docs features, \
others are just code that we ship and enable during builds on Read the Docs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-readthedocs-sphinx-ext-2.2.0-2.1.noarch.rpm"
RPM_HASH = "3cf20d2bfeaa131a255d4dfde087c3cf9a7e21aae93ecff148b775422a65b44ff61509baae8c0d77e728e3b5f38cbe1421ab66a773eb45f714cd2a84927a52a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(readthedocs-sphinx-ext) python39-readthedocs-sphinx-ext python3dist(readthedocs-sphinx-ext)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-requests"

inherit rpm
