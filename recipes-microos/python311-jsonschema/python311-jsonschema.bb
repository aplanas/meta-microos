SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python311-jsonschema-4.17.3-3.1.noarch.rpm"
RPM_HASH = "564e378122a1fb889eb4a9406108c61eb8933d1ed1c4795b510208d0c413fda25bc251a3b9f25eb5153e38d0e40c1c0b28f8ccc59fffefe7e02c4155c142262f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonschema) \
python311-jsonschema \
python3dist(jsonschema)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-attrs \
python311-pyrsistent"

inherit rpm
