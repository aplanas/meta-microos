SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-newrelicobservability-1.0.0-1.1.noarch.rpm"
RPM_HASH = "bc199a5b14922797b9bbb7882c25db410be976049d40aa0294a517fe4a2a2b3c519d4a5b9ceacb66b50bcca2ba3e22a697a858c680534cd991c1ab0936a6e7b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-newrelicobservability) python39-azure-mgmt-newrelicobservability python3dist(azure-mgmt-newrelicobservability)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
