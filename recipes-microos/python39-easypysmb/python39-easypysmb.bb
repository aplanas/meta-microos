SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python39-easypysmb-1.4.4-1.12.noarch.rpm"
RPM_HASH = "91aa59a2fa4ccd1470d8dcdfebffb91c85d330be6b886f0b7057ddb201d048b6e1ec328b8b6b758825e2b375ba2a10bc5590f67060b1ad8522d400e8c402eb12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(easypysmb) python39-easypysmb python3dist(easypysmb)"
RDEPENDS:${PN} += "python(abi) python39-pysmb"

inherit rpm
