SUMMARY = "Ruby Graph Library"
DESCRIPTION = "RGL is a framework for graph data structures and algorithms."
LICENSE = "BSD-2-Clause"

PV = "0.5.10"

RPM_NAME = "ruby3.2-rubygem-rgl-0.5.10-1.1.aarch64.rpm"
RPM_HASH = "9333bebf17869040640f19b842f3710ca466062201f69439d3b10abeab9c61bba861ecb8e44bdf3f698de968ec43e0f3fb37f7c02f75bf46255d2c659cfaca2d"

RPROVIDES:${PN} += "ruby3.2-rubygem-rgl \
ruby3.2-rubygem-rgl(aarch-64) \
rubygem(rgl) \
rubygem(ruby:3.2.0:rgl) \
rubygem(ruby:3.2.0:rgl:0) \
rubygem(ruby:3.2.0:rgl:0.5) \
rubygem(ruby:3.2.0:rgl:0.5.10)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:pairing_heap) \
rubygem(ruby:3.2.0:rexml) \
rubygem(ruby:3.2.0:rexml:3) \
rubygem(ruby:3.2.0:stream:0.5)"

inherit rpm
