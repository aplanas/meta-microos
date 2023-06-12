SUMMARY = "RSpecs test double framework, with support for stubbing and mocking"
DESCRIPTION = "rspec-mocks is a test-double framework for rspec with support for method stubs, fakes, and message expectations on generated test-doubles and real objects alike."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "ruby3.2-rubygem-rspec-mocks-3_5-3.5.0-1.24.aarch64.rpm"
RPM_HASH = "0e128cf15019a8102374f5bb8df687aabbe295834b32f3321ea39dd6dbe5c0e1ef16b59d06c1558d053478d7dd9266437b56f77095a97b804287c842d4d20344"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-mocks-3_5 \
ruby3.2-rubygem-rspec-mocks-3_5(aarch-64) \
rubygem(rspec-mocks) \
rubygem(ruby:3.2.0:rspec-mocks) \
rubygem(ruby:3.2.0:rspec-mocks:3) \
rubygem(ruby:3.2.0:rspec-mocks:3.5) \
rubygem(ruby:3.2.0:rspec-mocks:3.5.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:diff-lcs) \
rubygem(ruby:3.2.0:rspec-support:3.5)"

inherit rpm
