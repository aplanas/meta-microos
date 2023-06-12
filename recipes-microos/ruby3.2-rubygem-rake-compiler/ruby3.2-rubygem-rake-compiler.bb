SUMMARY = "Rake-based Ruby Extension (C, Java) task generator"
DESCRIPTION = "Provide a standard and simplified way to build and package \
Ruby extensions (C, Java) using Rake as glue."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ruby3.2-rubygem-rake-compiler-1.2.0-1.9.aarch64.rpm"
RPM_HASH = "b6f9ffa9776b8c3ed482ea65794dc282620e7da2515405c306efb97a57669d536565a8777c208de13fd015227eb1753eab17ba0d43c9e7fcbdf317a189545712"

RPROVIDES:${PN} += "ruby3.2-rubygem-rake-compiler \
ruby3.2-rubygem-rake-compiler(aarch-64) \
rubygem(rake-compiler) \
rubygem(ruby:3.2.0:rake-compiler) \
rubygem(ruby:3.2.0:rake-compiler:1) \
rubygem(ruby:3.2.0:rake-compiler:1.2) \
rubygem(ruby:3.2.0:rake-compiler:1.2.0)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:rake) \
update-alternatives"

inherit rpm
