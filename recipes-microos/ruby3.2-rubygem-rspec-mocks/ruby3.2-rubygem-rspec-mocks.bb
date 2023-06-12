SUMMARY = "RSpec's 'test double' framework, with support for stubbing and mocking"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking."
LICENSE = "MIT"

PV = "3.12.3"

RPM_NAME = "ruby3.2-rubygem-rspec-mocks-3.12.3-1.2.aarch64.rpm"
RPM_HASH = "c04a40a8993b16cec1a6fe5e87d1784a4d2c1eaa996ffe0c08e64f566c6677a4a43719c2f87401e960d4f56f5ce2e94cb30d23289a3968df8ebe77354177acc0"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-mocks \
ruby3.2-rubygem-rspec-mocks(aarch-64) \
rubygem(rspec-mocks) \
rubygem(ruby:3.2.0:rspec-mocks) \
rubygem(ruby:3.2.0:rspec-mocks:3) \
rubygem(ruby:3.2.0:rspec-mocks:3.12) \
rubygem(ruby:3.2.0:rspec-mocks:3.12.3)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:diff-lcs) \
rubygem(ruby:3.2.0:rspec-support:3.12)"

inherit rpm
