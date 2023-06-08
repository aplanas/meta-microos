SUMMARY = "The complete solution for Ruby command-line executables"
DESCRIPTION = "The complete solution for Ruby command-line executables. Commander bridges the \
gap between other terminal related libraries you know and love (OptionParser, \
HighLine), while providing many new features, and an elegant API."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "ruby3.2-rubygem-commander-4.6.0-1.12.aarch64.rpm"
RPM_HASH = "001596f61035b14c090a4596a7deb437ecd2a19da513892b395f456c0aa8a76cc5cbc9b6bcb19aecb25c8928fac1ab9454925e2b09d98d284d3fb3016996d1cf"

RPROVIDES:${PN} += "ruby3.2-rubygem-commander ruby3.2-rubygem-commander(aarch-64) rubygem(commander) rubygem(ruby:3.2.0:commander) rubygem(ruby:3.2.0:commander:4) rubygem(ruby:3.2.0:commander:4.6) rubygem(ruby:3.2.0:commander:4.6.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:highline:2.0) update-alternatives"

inherit rpm
