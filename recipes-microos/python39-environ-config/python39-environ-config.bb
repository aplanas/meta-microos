SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "python39-environ-config-23.2.0-1.1.noarch.rpm"
RPM_HASH = "5b8d379a24ebe2431ac6a269dc37e52780a02e77c9250e812cd3cf032cc51c2ea3bde1361540faf1f78d89a616a50e40db01206e687e8c22d5e1b88163c23094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(environ-config) python39-environ-config python3dist(environ-config)"
RDEPENDS:${PN} += "python(abi) python39-attrs"

inherit rpm
