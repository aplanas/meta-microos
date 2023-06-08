SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.95.1"

RPM_NAME = "python310-fastapi-0.95.1-2.1.noarch.rpm"
RPM_HASH = "5bc18711860f4ad587d881f12ea3a95c4116ccfe9f10077231817c96ad83972422596b95c35a75f69f64ab40e00afcb0af82991881e39cfb3ef5ab4c2d1a5edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastapi python3.10dist(fastapi) python310-fastapi python3dist(fastapi)"
RDEPENDS:${PN} += "python(abi) python310-pydantic python310-starlette"

inherit rpm
