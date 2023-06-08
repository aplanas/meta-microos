SUMMARY = "Common code needed by the other RSpec gems"
DESCRIPTION = "Support utilities for RSpec gems."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "ruby3.2-rubygem-rspec-support-3_5-3.5.0-1.25.aarch64.rpm"
RPM_HASH = "392db6867be12df44fbca44b69fac29c061b3bcde45e356ba7f332a09e036c76a94164bd8a7e8386b4fa320a042a67e1ecb55185540f3c9e1e50e2a22846748c"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-support-3_5 ruby3.2-rubygem-rspec-support-3_5(aarch-64) rubygem(rspec-support) rubygem(ruby:3.2.0:rspec-support) rubygem(ruby:3.2.0:rspec-support:3) rubygem(ruby:3.2.0:rspec-support:3.5) rubygem(ruby:3.2.0:rspec-support:3.5.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
