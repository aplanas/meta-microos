SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "python311-pydantic-1.10.8-1.1.noarch.rpm"
RPM_HASH = "77a5d1d1de4da694a24ff23a9ab51b6d02d9626ac82ea0d447bd509b58affd315cefdb6ece464c5f2b3423835d4b2bbf5960426676f112a8535139f8da72452c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydantic) \
python311-pydantic \
python3dist(pydantic)"
RDEPENDS:${PN} += "python(abi) \
python311-typing_extensions"

inherit rpm
