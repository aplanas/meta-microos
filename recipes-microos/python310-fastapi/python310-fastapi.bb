SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.95.2"

RPM_NAME = "python310-fastapi-0.95.2-1.1.noarch.rpm"
RPM_HASH = "b7f0acaacc1757a5f51bead7208c5d09b828f6fd2c956a13e11ca6347fd338fbbaae41c82c71fb4774e90f71c9651f3634087b710cfe2927643995fd4afea725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastapi python3.10dist(fastapi) python310-fastapi python3dist(fastapi)"
RDEPENDS:${PN} += "python(abi) python310-pydantic python310-starlette"

inherit rpm
