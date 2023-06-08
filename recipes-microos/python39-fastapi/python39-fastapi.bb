SUMMARY = "FastAPI framework"
DESCRIPTION = "Python FastAPI framework."
LICENSE = "MIT"

PV = "0.95.1"

RPM_NAME = "python39-fastapi-0.95.1-2.1.noarch.rpm"
RPM_HASH = "59343ab0644c020b9ac3746c0a1c93f0916be3b44b7b70df5c05ec3e6dc172eb081e73d946e7cae0c4fceac845834bc197899b4e994ee9b7e2f9d91b3e4f1425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fastapi) python39-fastapi python3dist(fastapi)"
RDEPENDS:${PN} += "python(abi) python39-pydantic python39-starlette"

inherit rpm
