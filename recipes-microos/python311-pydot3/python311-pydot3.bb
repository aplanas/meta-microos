SUMMARY = "Create (dot) graphs from python"
DESCRIPTION = "pydot allows to easily create both directed and non directed graphs from Python. \
Currently all attributes implemented in the Dot language are supported (up to Graphviz 2.16)."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python311-pydot3-1.0.9-3.7.noarch.rpm"
RPM_HASH = "4ab569fe43c5ba51f83f88402c71329507ac6aa74ba2be7a50595b207fa271bb4e1fdb232837c438c0ae415a3b54ad8cb76722bd058116e771e0741c252185d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydot3) \
python311-pydot3 \
python3dist(pydot3)"
RDEPENDS:${PN} += "graphviz \
python(abi) \
python311-pyparsing"

inherit rpm
