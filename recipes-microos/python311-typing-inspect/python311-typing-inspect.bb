SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-typing-inspect-0.8.0-2.1.noarch.rpm"
RPM_HASH = "e0acc20a782d8658446da48a8cd5284c6f22b3bd962071c1117b5aed38c952bf95fb7a32bb87cc707c393517e90c39f6f2b3a0eefe89a4fdced173083be202ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(typing-inspect) python311-typing-inspect python3dist(typing-inspect)"
RDEPENDS:${PN} += "python(abi) python311-mypy_extensions python311-typing_extensions"

inherit rpm
