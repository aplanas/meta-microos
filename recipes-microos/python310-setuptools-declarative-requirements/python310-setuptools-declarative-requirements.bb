SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-setuptools-declarative-requirements-1.2.0-1.10.noarch.rpm"
RPM_HASH = "71cc5b3a9d99d855b02ed6345bae78a8fac683fc856ec7b784d59a5a6791ed572569d270762a587f0cecc371576174625ae6bb89bf03780eeca4c79ded09d909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-declarative-requirements python3.10dist(setuptools-declarative-requirements) python310-setuptools-declarative-requirements python3dist(setuptools-declarative-requirements)"
RDEPENDS:${PN} += "python(abi) python310-setuptools python310-toml python310-wheel"

inherit rpm
