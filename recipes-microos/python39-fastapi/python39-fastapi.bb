SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.95.2"

RPM_NAME = "python39-fastapi-0.95.2-1.1.noarch.rpm"
RPM_HASH = "e00f125e1975d63cb2df7b5a058a15d79e00a8ccc0f042590f396b35fc0f4d61ddc4da7eb82c76f5b08ad58f7ca03611a9e529a2cf5fa2da54853a6ce5c8e20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fastapi) python39-fastapi python3dist(fastapi)"
RDEPENDS:${PN} += "python(abi) python39-pydantic python39-starlette"

inherit rpm
