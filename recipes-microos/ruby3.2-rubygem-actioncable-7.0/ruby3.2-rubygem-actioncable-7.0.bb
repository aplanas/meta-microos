SUMMARY = "WebSocket framework for Rails"
DESCRIPTION = "Structure many real-time application concerns into channels over a single \
WebSocket connection."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-actioncable-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "d50bf51bb2b48c58d3d271fcc7658d0610a663ebedd0b4d03f2efefbc284644e30f7d4cb5e46e75220f97be6ba6e6d98870a934ceb9e6899defbaaf6e08d98d3"

RPROVIDES:${PN} += "ruby3.2-rubygem-actioncable-7.0 \
ruby3.2-rubygem-actioncable-7.0(aarch-64) \
rubygem(actioncable) \
rubygem(ruby:3.2.0:actioncable) \
rubygem(ruby:3.2.0:actioncable:7) \
rubygem(ruby:3.2.0:actioncable:7.0) \
rubygem(ruby:3.2.0:actioncable:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:nio4r:2) \
rubygem(ruby:3.2.0:websocket-driver)"

inherit rpm
