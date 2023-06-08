SUMMARY = "Provides 'its' method formerly part of rspec-core"
DESCRIPTION = "RSpec extension gem for attribute matching."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ruby3.2-rubygem-rspec-its-1.3.0-1.17.aarch64.rpm"
RPM_HASH = "08c306a030c53c8ae19393472d1213a546477705d7dfca95884232310a1734c9d7735a01401c63c5b2373d0bed39becf97c52d3fb5fae4b937414a21983b2bc6"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-its ruby3.2-rubygem-rspec-its(aarch-64) rubygem(rspec-its) rubygem(ruby:3.2.0:rspec-its) rubygem(ruby:3.2.0:rspec-its:1) rubygem(ruby:3.2.0:rspec-its:1.3) rubygem(ruby:3.2.0:rspec-its:1.3.0)"
RDEPENDS:${PN} += "/bin/bash ruby(abi) rubygem(ruby:3.2.0:rspec-core) rubygem(ruby:3.2.0:rspec-expectations)"

inherit rpm
