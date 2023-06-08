SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-pathable-0.4.3-2.1.noarch.rpm"
RPM_HASH = "c00f4a5b9eb1e71e4b8ae4aae0d145d53d4239d489718d863f69a2fc3b70ece1c5acb971275eead0eacf20afef7d55b6ee21e44ea04b392409747397d09da846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pathable) python311-dictpath python311-pathable python3dist(pathable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
