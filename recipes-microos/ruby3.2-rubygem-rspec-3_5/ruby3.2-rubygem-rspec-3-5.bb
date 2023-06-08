SUMMARY = "Behaviour Driven Development for Ruby"
DESCRIPTION = "Behaviour Driven Development for Ruby. Making TDD Productive and Fun."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "ruby3.2-rubygem-rspec-3_5-3.5.0-1.24.aarch64.rpm"
RPM_HASH = "d24fa679f46ce9593723cc02f284bd272442c1bff2b122ff573f2fa949b4560d737538934edb0f2f7a49f2f282c3aa56d120d126463bdf2d55955deef78ee369"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-3_5 ruby3.2-rubygem-rspec-3_5(aarch-64) rubygem(rspec) rubygem(ruby:3.2.0:rspec) rubygem(ruby:3.2.0:rspec:3) rubygem(ruby:3.2.0:rspec:3.5) rubygem(ruby:3.2.0:rspec:3.5.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:rspec-core:3.5) rubygem(ruby:3.2.0:rspec-expectations:3.5) rubygem(ruby:3.2.0:rspec-mocks:3.5)"

inherit rpm
