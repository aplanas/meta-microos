SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-cloup-2.1.0-1.1.noarch.rpm"
RPM_HASH = "1623936004adc4a3a3011a5d2141f69c9c3f23194c63a566aebaa6e0f3bc1e53ecd92eb3679aade4aae1299d7f730cfe8f8a0e9cc7875ba2d4895fedc1f11687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cloup) python39-cloup python3dist(cloup)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
