SUMMARY = "JSON parsing for fog providers"
DESCRIPTION = "Extraction of the JSON parsing tools shared between a \
number of providers in the 'fog' gem."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ruby3.2-rubygem-fog-json-1.2.0-1.17.aarch64.rpm"
RPM_HASH = "0c81e9d904192236188171b62a349cae5cb012eecb71feb15dcc05cc45a3ba2514b4624f60ae99531c8034148b9bd9656f1fba79f542b5cfa970d1b063821b17"

RPROVIDES:${PN} += "ruby3.2-rubygem-fog-json \
ruby3.2-rubygem-fog-json(aarch-64) \
rubygem(fog-json) \
rubygem(ruby:3.2.0:fog-json) \
rubygem(ruby:3.2.0:fog-json:1) \
rubygem(ruby:3.2.0:fog-json:1.2) \
rubygem(ruby:3.2.0:fog-json:1.2.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:fog-core) \
rubygem(ruby:3.2.0:multi_json:1)"

inherit rpm
