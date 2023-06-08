SUMMARY = "GRPC system in Ruby"
DESCRIPTION = "Send RPCs from Ruby using GRPC."
LICENSE = "Apache-2.0"

PV = "1.52.0"

RPM_NAME = "ruby3.2-rubygem-grpc-1.52.0-1.4.aarch64.rpm"
RPM_HASH = "80962deedbcc7aa7c9e3cf7eb7d0d602cc6d5509c339ecf796ecf41b09304e5d7a1bfc0b61b3ab182e719a1fb48829426a64cdad54592511a85ec23cdaf82c50"

RPROVIDES:${PN} += "ruby3.2-rubygem-grpc ruby3.2-rubygem-grpc(aarch-64) rubygem(grpc) rubygem(ruby:3.2.0:grpc) rubygem(ruby:3.2.0:grpc:1) rubygem(ruby:3.2.0:grpc:1.52) rubygem(ruby:3.2.0:grpc:1.52.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libruby3.2.so.3.2()(64bit) ruby(abi) rubygem(ruby:3.2.0:google-protobuf:3) rubygem(ruby:3.2.0:googleapis-common-protos-types:1)"

inherit rpm
