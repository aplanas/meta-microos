SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "ruby3.2-rubygem-passenger-6.0.17-1.4.aarch64.rpm"
RPM_HASH = "b102f5cffe68f62f4fd0c12589757eaeb36d901494e9632257ac2651186b92b8d91ba58a7d965e4c09ba422c68067615f9fc3ab600ba25d19ff8134beb16c29c"

RPROVIDES:${PN} += "ruby3.2-rubygem-passenger ruby3.2-rubygem-passenger(aarch-64) rubygem(passenger) rubygem(ruby:3.2.0:passenger) rubygem(ruby:3.2.0:passenger:6) rubygem(ruby:3.2.0:passenger:6.0) rubygem(ruby:3.2.0:passenger:6.0.17)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/node /usr/bin/ruby.ruby3.2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby(abi) rubygem(ruby:3.2.0:rack) rubygem(ruby:3.2.0:rake) rubygem-passenger update-alternatives"

inherit rpm
