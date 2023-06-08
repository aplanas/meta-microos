SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-httmock-1.4.0-1.11.noarch.rpm"
RPM_HASH = "2981c1ac0f8a066c90d0c5d104b649e98d04a0bb62c0c91879bb5311829a1a1aed0e336c0041e85969fec3e32d0cd7a0f8648daaceb591276f2ba6148bd6ad1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(httmock) python311-httmock python3dist(httmock)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
