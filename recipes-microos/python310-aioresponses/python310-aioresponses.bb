SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-aioresponses-0.7.4-1.3.noarch.rpm"
RPM_HASH = "52b0c46cd7b2fb6b040534ddaab14373fe3f5dbcafcf849fcb1fde7e829bdb87db6072c2b0f296e9cf83e6492767f80aec9bc638faf50182d1ba04bab48f096d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioresponses \
python3.10dist(aioresponses) \
python310-aioresponses \
python3dist(aioresponses)"
RDEPENDS:${PN} += "python(abi) \
python310-aiohttp"

inherit rpm
