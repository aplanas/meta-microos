SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python311-synr-0.6.0-1.6.noarch.rpm"
RPM_HASH = "ac8e7cff3f68308b3afe150a735ae452f2247e2338a9ad9bbbcb9aad6689bd25986396482b8ae950840aa66b6db541f3343c38d6a681087ae50169297d2057b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(synr) python311-synr python3dist(synr)"
RDEPENDS:${PN} += "python(abi) python311-attrs"

inherit rpm
