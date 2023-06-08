SUMMARY = "XMLRPC is a lightweight protocol that enables remote procedure calls"
DESCRIPTION = "XMLRPC is a lightweight protocol that enables remote procedure calls over \
HTTP."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.3.2"

RPM_NAME = "ruby3.2-rubygem-xmlrpc-0.3.2-1.6.aarch64.rpm"
RPM_HASH = "90a3025e686ae6cadf08afb1fe6c25a7ff73bd7700b0b90fa70c3f4aa030a616d15de732f576037d3cdbf1bdeb607e2c566df00ca287dbfdd9979d53e712b32b"

RPROVIDES:${PN} += "ruby3.2-rubygem-xmlrpc ruby3.2-rubygem-xmlrpc(aarch-64) rubygem(ruby:3.2.0:xmlrpc) rubygem(ruby:3.2.0:xmlrpc:0) rubygem(ruby:3.2.0:xmlrpc:0.3) rubygem(ruby:3.2.0:xmlrpc:0.3.2) rubygem(xmlrpc)"
RDEPENDS:${PN} += "/usr/bin/env /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:webrick)"

inherit rpm
