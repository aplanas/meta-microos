SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python310-environ-config-22.1.0-1.3.noarch.rpm"
RPM_HASH = "c0a6d1484003f47f8a63f17ae29368808750a06c048c1272a5e971321fca703ae3c8a6fcd057522887bc9450ea1eed04ea78fedbf248ec3906ddad7a94fd06b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environ-config python3.10dist(environ-config) python310-environ-config python3dist(environ-config)"
RDEPENDS:${PN} += "python(abi) python310-attrs"

inherit rpm
