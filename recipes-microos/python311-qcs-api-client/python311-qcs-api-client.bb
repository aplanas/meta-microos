SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "python311-qcs-api-client-0.21.3-1.3.noarch.rpm"
RPM_HASH = "7b3b7e281cc9affdb6ddb71c2a39597364cb53df61e0f269d61e46bf1e28aa94225169268a158f3d5567c430569e4e2aba819d707fba26a936076552967c9331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qcs-api-client) python311-qcs-api-client python3dist(qcs-api-client)"
RDEPENDS:${PN} += "python(abi) python311-PyJWT python311-attrs python311-dateutil python311-httpx python311-iso8601 python311-pyRFC3339 python311-pydantic python311-retrying python311-toml"

inherit rpm
