SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python311-pytest-asyncio-0.21.0-1.1.noarch.rpm"
RPM_HASH = "c4242aeb947ea751da0e669bbde5d9d8b2237940946c5ed2c6a8e47344493010d03ac4077459d1102fa4fcd936a11af177ad6da2ceca6909d41bd1f16cb0b63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-asyncio) \
python311-pytest-asyncio \
python3dist(pytest-asyncio)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
