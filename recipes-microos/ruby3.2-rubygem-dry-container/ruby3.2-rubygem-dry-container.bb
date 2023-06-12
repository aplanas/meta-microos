SUMMARY = "A simple, configurable object container implemented in Ruby"
DESCRIPTION = "A simple, configurable object container implemented in Ruby."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "ruby3.2-rubygem-dry-container-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "30cca379949076043657b2b8ef20c294b5b34d4db40253187dad303d0a1ba3b5978adea3e85f785557ddd8e44ffc42dc7a27a043a02f8cc7f7b936b40174e027"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-container \
ruby3.2-rubygem-dry-container(aarch-64) \
rubygem(dry-container) \
rubygem(ruby:3.2.0:dry-container) \
rubygem(ruby:3.2.0:dry-container:0) \
rubygem(ruby:3.2.0:dry-container:0.11) \
rubygem(ruby:3.2.0:dry-container:0.11.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:concurrent-ruby:1)"

inherit rpm
