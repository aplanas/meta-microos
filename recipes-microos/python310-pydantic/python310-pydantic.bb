SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.7"

RPM_NAME = "python310-pydantic-1.10.7-1.2.noarch.rpm"
RPM_HASH = "f3f6d2673843cfb18e2eb97f48c3c762479f3001b2b72a84293b10e6b3b1c0aebd988a08ae10fb68d6694d5603d52753d1913b517b06578a13d3f1bdf36e4073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydantic python3.10dist(pydantic) python310-pydantic python3dist(pydantic)"
RDEPENDS:${PN} += "python(abi) python310-typing_extensions"

inherit rpm
