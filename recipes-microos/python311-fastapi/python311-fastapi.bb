SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.95.1"

RPM_NAME = "python311-fastapi-0.95.1-2.1.noarch.rpm"
RPM_HASH = "16ea99ea4f543710d9d19d95cb3c20403e90b562a71140813bb6626af21d4c38cac694039a16b627815e133b261e3fd223d2f5a8b6496b5c5107ab9ededf59a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fastapi) python311-fastapi python3dist(fastapi)"
RDEPENDS:${PN} += "python(abi) python311-pydantic python311-starlette"

inherit rpm
