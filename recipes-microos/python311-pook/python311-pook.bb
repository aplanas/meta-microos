SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-pook-1.1.1-1.3.noarch.rpm"
RPM_HASH = "ef15ebd773fd008b5b24164f9b3379d3575a97cc4739defb40a6de11a2235dcc007015369e281164cbc32cb08c36862b78cc1f712c12a71083965d6149d0830f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pook) python311-pook python3dist(pook)"
RDEPENDS:${PN} += "python(abi) python311-aiohttp python311-furl python311-jsonschema python311-xmltodict"

inherit rpm
