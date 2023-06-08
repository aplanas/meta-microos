SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python311-warlock-2.0.1-1.3.noarch.rpm"
RPM_HASH = "39da635e040bb809fc31837fff79089e3b85f9dcf884ed629394c8dbd266cb1913d624dc9c01cb8443516c842c0a7051dd68705e01284fbaae58d27052e4028a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(warlock) python311-warlock python3dist(warlock)"
RDEPENDS:${PN} += "python(abi) python311-jsonpatch python311-jsonschema"

inherit rpm
