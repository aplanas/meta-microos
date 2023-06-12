SUMMARY = "Universal Ruby library to handle WebSocket protocol"
DESCRIPTION = "Universal Ruby library to handle WebSocket protocol."
LICENSE = "MIT"

PV = "1.2.9"

RPM_NAME = "ruby3.2-rubygem-websocket-1.2.9-1.13.aarch64.rpm"
RPM_HASH = "7cb6a13472daf07c5aadd999c1debcd4623060b2c10b98898830278a61676a92fcd0c9dfb8542c9617b15709f72676255560573725bd2ee4a06a64111c95a24d"

RPROVIDES:${PN} += "ruby3.2-rubygem-websocket \
ruby3.2-rubygem-websocket(aarch-64) \
rubygem(ruby:3.2.0:websocket) \
rubygem(ruby:3.2.0:websocket:1) \
rubygem(ruby:3.2.0:websocket:1.2) \
rubygem(ruby:3.2.0:websocket:1.2.9) \
rubygem(websocket)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
