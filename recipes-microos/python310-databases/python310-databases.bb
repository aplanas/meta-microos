SUMMARY = "Async database support for Python"
DESCRIPTION = "Async database support for Python."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python310-databases-0.6.2-1.4.noarch.rpm"
RPM_HASH = "0e5f8eb3c2d9aad3673177d961cf6354213c53c204ac2c83ec3ae6aa2ea930022a3244520201fc352975a6ba7daa3ca3eecdb6871e942521630c36d86d05eb21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-databases python3.10dist(databases) python310-databases python3dist(databases)"
RDEPENDS:${PN} += "python(abi) python310-sqlalchemy"

inherit rpm
