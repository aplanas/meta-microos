SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python39-txZMQ-1.0.0-1.3.noarch.rpm"
RPM_HASH = "3704d7e2c3a1eb8c2a7c3ebf4f57feb4bb5bc61e1648aa044e02eb66299a4cd01efdb5a2aff17a1b83c7602cf22a15fe0553a31109dc2c246470ed74ebc1ddd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(txzmq) python39-txZMQ python3dist(txzmq)"
RDEPENDS:${PN} += "python(abi) python39-Twisted python39-pyzmq"

inherit rpm
