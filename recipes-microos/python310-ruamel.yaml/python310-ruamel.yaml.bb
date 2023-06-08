SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.21"

RPM_NAME = "python310-ruamel.yaml-0.17.21-2.1.noarch.rpm"
RPM_HASH = "35401061b983b2b9fdfa0a640651b60ab55a65900b18bff2b228e46bed28f551c015e83dfc18bbbbd020ba396019c5e2810669ee9991ffbe061f4008e0109147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml python3.10dist(ruamel.yaml) python310-ruamel.yaml python3dist(ruamel.yaml)"
RDEPENDS:${PN} += "python(abi) python310-ruamel.yaml.clib"

inherit rpm
