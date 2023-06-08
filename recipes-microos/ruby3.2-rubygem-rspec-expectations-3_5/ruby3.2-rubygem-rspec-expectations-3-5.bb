SUMMARY = "Provides a simple, readable API to express expected outcomes of a code example"
DESCRIPTION = "rspec-expectations provides a simple, readable API to express expected outcomes of a code example."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "ruby3.2-rubygem-rspec-expectations-3_5-3.5.0-1.25.aarch64.rpm"
RPM_HASH = "e5d8d4e5ffbb9929ad7640ea9e6f9e34edb0c745cca021a0564c8cbdcadd1f07bed8680f09ef5d8d4080c940a9b97c4150b25ae9221a0664c6930759a61c42cd"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-expectations-3_5 ruby3.2-rubygem-rspec-expectations-3_5(aarch-64) rubygem(rspec-expectations) rubygem(ruby:3.2.0:rspec-expectations) rubygem(ruby:3.2.0:rspec-expectations:3) rubygem(ruby:3.2.0:rspec-expectations:3.5) rubygem(ruby:3.2.0:rspec-expectations:3.5.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:diff-lcs) rubygem(ruby:3.2.0:rspec-support:3.5)"

inherit rpm
