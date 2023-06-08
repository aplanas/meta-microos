SUMMARY = "The speed of a single-page web application without having to write"
DESCRIPTION = "The speed of a single-page web application without having to write any \
JavaScript."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "ruby3.2-rubygem-turbo-rails-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "784891872a83c6260835e256b685e40c293ff012036173d3dc30530e4ec5adff6095240939a354334e095842d8d4c37d33ec2da820bb30cfdb1963d2b54cd45a"

RPROVIDES:${PN} += "ruby3.2-rubygem-turbo-rails ruby3.2-rubygem-turbo-rails(aarch-64) rubygem(ruby:3.2.0:turbo-rails) rubygem(ruby:3.2.0:turbo-rails:1) rubygem(ruby:3.2.0:turbo-rails:1.3) rubygem(ruby:3.2.0:turbo-rails:1.3.2) rubygem(turbo-rails)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:actionpack) rubygem(ruby:3.2.0:activejob) rubygem(ruby:3.2.0:railties)"

inherit rpm
