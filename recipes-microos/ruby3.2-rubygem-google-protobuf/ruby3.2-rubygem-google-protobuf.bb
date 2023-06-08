SUMMARY = "Protocol Buffers"
DESCRIPTION = "Protocol Buffers are Google's data interchange format."
LICENSE = "BSD-3-Clause"

PV = "3.21.10"

RPM_NAME = "ruby3.2-rubygem-google-protobuf-3.21.10-1.5.aarch64.rpm"
RPM_HASH = "58fff2522995d713c5062fe9b831bf25a8dc7efce0d9bc5017f5bb62cae365ff2c83cba07917b90d72a1a3f9e1b71fad97f9eedb84a6b76c8a1ec48aba962025"

RPROVIDES:${PN} += "ruby3.2-rubygem-google-protobuf ruby3.2-rubygem-google-protobuf(aarch-64) rubygem(google-protobuf) rubygem(ruby:3.2.0:google-protobuf) rubygem(ruby:3.2.0:google-protobuf:3) rubygem(ruby:3.2.0:google-protobuf:3.21) rubygem(ruby:3.2.0:google-protobuf:3.21.10)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby(abi)"

inherit rpm
