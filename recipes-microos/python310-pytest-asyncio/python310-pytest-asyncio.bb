SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python310-pytest-asyncio-0.21.0-1.1.noarch.rpm"
RPM_HASH = "f7ef44707b350bce194bbeb829ce1bc983b7113935ebc8e68036b8b9c65197faeb21ded06b24fc29fbae9bc549b3ce582e9008770ff34a57d53f3a2ec31de23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-asyncio python3.10dist(pytest-asyncio) python310-pytest-asyncio python3dist(pytest-asyncio)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
