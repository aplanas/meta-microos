SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python310-weblate-schemas-2022.1-1.3.noarch.rpm"
RPM_HASH = "f96ddd6130f8bafab67a642ad54a63d96b30907e921c66a7d98cf8f39a5af4b6b6cfa91b2a5308c9f81b13b8ea4b53beb244fbbcc28cb4695d296b5753972f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-schemas python3.10dist(weblate-schemas) python310-weblate-schemas python3dist(weblate-schemas)"
RDEPENDS:${PN} += "python(abi) python310-jsonschema"

inherit rpm
