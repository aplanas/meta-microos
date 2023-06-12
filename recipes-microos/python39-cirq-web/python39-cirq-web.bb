SUMMARY = "Web-based 3D visualization tools for Cirq"
DESCRIPTION = "Cirq is a Python library for writing, manipulating, and optimizing quantum \
circuits and running them against quantum computers and simulators. \
 \
This package allows users to take advantage of browser based 3D visualization tools \
and features in Cirq. cirq-web also provides a development environment for contributors to create and add \
their own visualizations to the module."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-web-0.13.1-1.5.noarch.rpm"
RPM_HASH = "b9044dfc68eef65bb61a77855e2b4aac0836912d32c54a0ba20a38803da28ca636e2fb92000e8299d259ade4c6dfe16744ad949ab9fb6730b9c241411485ab08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cirq-web) \
python39-cirq-web \
python3dist(cirq-web)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
