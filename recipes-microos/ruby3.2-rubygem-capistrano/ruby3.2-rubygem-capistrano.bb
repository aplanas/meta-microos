SUMMARY = "Capistrano - Welcome to easy deployment with Ruby over SSH"
DESCRIPTION = "Capistrano is a utility and framework for executing commands in parallel on \
multiple remote machines, via SSH."
LICENSE = "MIT"

PV = "3.17.1"

RPM_NAME = "ruby3.2-rubygem-capistrano-3.17.1-1.6.aarch64.rpm"
RPM_HASH = "cd57d15e3b80556f91eff3beb13d1b0eca267149f482ba072c6e955e18ad306be3dce05ed3eaff6d70afbe0c81d05d31c73897c4ae708f5947c7fb6496d41046"

RPROVIDES:${PN} += "ruby3.2-rubygem-capistrano \
ruby3.2-rubygem-capistrano(aarch-64) \
rubygem(capistrano) \
rubygem(ruby:3.2.0:capistrano) \
rubygem(ruby:3.2.0:capistrano:3) \
rubygem(ruby:3.2.0:capistrano:3.17) \
rubygem(ruby:3.2.0:capistrano:3.17.1)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:airbrussh) \
rubygem(ruby:3.2.0:i18n) \
rubygem(ruby:3.2.0:rake) \
rubygem(ruby:3.2.0:sshkit) \
update-alternatives"

inherit rpm
