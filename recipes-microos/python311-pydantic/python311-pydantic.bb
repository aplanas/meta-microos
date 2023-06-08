SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.7"

RPM_NAME = "python311-pydantic-1.10.7-1.2.noarch.rpm"
RPM_HASH = "178621449c50a3dddfd85e9b9b0ff2b2981025522fb9a6e0285838b09627e24cba69b5962bbf4b83efa00dfbd2e4fc3100e13bcab5d325e02e710e240b7b5655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydantic) python311-pydantic python3dist(pydantic)"
RDEPENDS:${PN} += "python(abi) python311-typing_extensions"

inherit rpm
