SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "python39-pydantic-1.10.8-1.1.noarch.rpm"
RPM_HASH = "60feeb2358c51dabcf4af9dc4ad17057c67917939aa3a8dd628021fa53c8979923865e05591c8e1c9fbbb53e5f99c2045d305476137563479ff549bc2dbbe899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydantic) python39-pydantic python3dist(pydantic)"
RDEPENDS:${PN} += "python(abi) python39-typing_extensions"

inherit rpm
