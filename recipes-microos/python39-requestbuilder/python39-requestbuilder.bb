SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python39-requestbuilder-0.7.1-1.15.noarch.rpm"
RPM_HASH = "15a1978e75b4a4486c63fa7ea5dc6a7ada8a47ebab6da0093e9c20bc6620bc11f3299d168a72f0ba2a10d0868a92ae8f2f961f773b7f239d1ac88f4740046a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requestbuilder) python39-requestbuilder python3dist(requestbuilder)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
