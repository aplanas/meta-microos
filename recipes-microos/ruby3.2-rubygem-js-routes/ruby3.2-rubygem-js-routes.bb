SUMMARY = "Brings Rails named routes to javascript"
DESCRIPTION = "Generates javascript file that defines all Rails named routes as javascript \
helpers."
LICENSE = "MIT"

PV = "2.2.5"

RPM_NAME = "ruby3.2-rubygem-js-routes-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "ae0d7a8ad018a8a8f8d53ffee63d114a51579120d3fdd87f8b561fcda27adf93fbdb537007b0448cdaabfbe51c6e9bfe3af6f5a15f56b097adbac541c38a17ff"

RPROVIDES:${PN} += "ruby3.2-rubygem-js-routes \
ruby3.2-rubygem-js-routes(aarch-64) \
rubygem(js-routes) \
rubygem(ruby:3.2.0:js-routes) \
rubygem(ruby:3.2.0:js-routes:2) \
rubygem(ruby:3.2.0:js-routes:2.2) \
rubygem(ruby:3.2.0:js-routes:2.2.5)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:railties)"

inherit rpm
