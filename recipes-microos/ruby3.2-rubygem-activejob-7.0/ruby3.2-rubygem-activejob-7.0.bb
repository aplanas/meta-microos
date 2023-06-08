SUMMARY = "Job framework with pluggable queues"
DESCRIPTION = "Declare job classes that can be run by a variety of queuing backends."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-activejob-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "f235ba7b6e3aa91b55c5a29b7166f1b1d92439e8bc1c871fc0805be6ba810f61c0bc8cdf515b726e2ae36dbcff117e29a5841f276a5a6e022da29ffcc5cfb1c4"

RPROVIDES:${PN} += "ruby3.2-rubygem-activejob-7.0 ruby3.2-rubygem-activejob-7.0(aarch-64) rubygem(activejob) rubygem(ruby:3.2.0:activejob) rubygem(ruby:3.2.0:activejob:7) rubygem(ruby:3.2.0:activejob:7.0) rubygem(ruby:3.2.0:activejob:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:activesupport) rubygem(ruby:3.2.0:globalid)"

inherit rpm
