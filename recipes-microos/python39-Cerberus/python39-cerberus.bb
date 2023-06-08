SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.2"

RPM_NAME = "python39-Cerberus-1.3.2-6.3.noarch.rpm"
RPM_HASH = "0d8c70a1d968e6abd13a7bf3c9f484b9fbf659a8558bc63b8472f0411caac935631b790d74f0e8b7024d6c2e831b8522d65ce0cef389f741e26213ba0e311cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cerberus) python39-Cerberus python3dist(cerberus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
