SUMMARY = "Strict, typed YAML parser"
DESCRIPTION = "StrictYAML is a type-safe YAML parser that parses and validates a \
restricted subset of the YAML specification. \
 \
Priorities: \
 \
 * No parsing of hard to read and insecure features of YAML like the \
   Norway problem. \
 * Strict validation of markup and straightforward type casting. \
 * Acting as a near-drop in replacement for pyyaml, ruamel.yaml or poyo. \
 * Comment preservation across a read-write cycle \
 * Speed is not a key concern"
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-strictyaml-1.6.2-1.3.noarch.rpm"
RPM_HASH = "f719fcb430bf750aa1d2c8f71edb56de7ebc339ec188dbf962853edc74366616219e30eaaf01af3f65546435967fa259d34e63c8b7acc745ff7dc1c104740e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(strictyaml) python39-strictyaml python3dist(strictyaml)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil"

inherit rpm
