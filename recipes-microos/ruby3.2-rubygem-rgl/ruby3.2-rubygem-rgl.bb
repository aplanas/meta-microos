SUMMARY = "Ruby Graph Library"
DESCRIPTION = "RGL is a framework for graph data structures and algorithms."
LICENSE = "BSD-2-Clause"

PV = "0.5.9"

RPM_NAME = "ruby3.2-rubygem-rgl-0.5.9-1.5.aarch64.rpm"
RPM_HASH = "b98ffc99b0cc0ea09afc2d37ede8d1559fb13649dac33e5ee8139ddbcb544c27bdfd6ade94befb59d37c58403b691aeda2172c695b065386ddb4251cc77bf29a"

RPROVIDES:${PN} += "ruby3.2-rubygem-rgl ruby3.2-rubygem-rgl(aarch-64) rubygem(rgl) rubygem(ruby:3.2.0:rgl) rubygem(ruby:3.2.0:rgl:0) rubygem(ruby:3.2.0:rgl:0.5) rubygem(ruby:3.2.0:rgl:0.5.9)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:pairing_heap) rubygem(ruby:3.2.0:rexml) rubygem(ruby:3.2.0:rexml:3) rubygem(ruby:3.2.0:stream:0.5)"

inherit rpm
