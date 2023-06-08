SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.7"

RPM_NAME = "python39-pydantic-1.10.7-1.2.noarch.rpm"
RPM_HASH = "5be231eadc47cb991e2ec405ec747e3a4cc84a1b237d076fdedaa9b67fa905cde9532b2ab62fcb61c868a6496327b651811c791578a6dcb948139a4be7bd5cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydantic) python39-pydantic python3dist(pydantic)"
RDEPENDS:${PN} += "python(abi) python39-typing_extensions"

inherit rpm
