SUMMARY = "Module to define equality, equivalence and inspection methods"
DESCRIPTION = "Module to define equality, equivalence and inspection methods."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby3.2-rubygem-dry-equalizer-0.3.0-1.16.aarch64.rpm"
RPM_HASH = "eb093514030726afa336ff2caeac6cc79c52c6f91a47952fe7e0558e5f70c3544eed4a6a912ffa91a14aae92565915e1f8b95b07b61ca7e92b0d837a518bfb4b"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-equalizer ruby3.2-rubygem-dry-equalizer(aarch-64) rubygem(dry-equalizer) rubygem(ruby:3.2.0:dry-equalizer) rubygem(ruby:3.2.0:dry-equalizer:0) rubygem(ruby:3.2.0:dry-equalizer:0.3) rubygem(ruby:3.2.0:dry-equalizer:0.3.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
