SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-pathable-0.4.3-2.1.noarch.rpm"
RPM_HASH = "cf604a157e3fea7f72ad55d6ee2635fdebe761fa2af8597ec4441782c4db706b8709c56a60ec552bb7e86571446a9047e7c12b7e5b4ef1276367f9f49e17b915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictpath python3-pathable python3.10dist(pathable) python310-dictpath python310-pathable python3dist(pathable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
