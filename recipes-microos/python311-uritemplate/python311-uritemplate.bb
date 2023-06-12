SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python311-uritemplate-4.1.1-2.3.noarch.rpm"
RPM_HASH = "3962d2f68354cbc84b0c3d4ffeb9c97638242cc6fa93131e98e664997f7e5d3ee59e10417d64d1e4422099dae8155c6c0f9f51d1ef7e0b2f1daa2114c81ce299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uritemplate) \
python311-uritemplate \
python3dist(uritemplate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
