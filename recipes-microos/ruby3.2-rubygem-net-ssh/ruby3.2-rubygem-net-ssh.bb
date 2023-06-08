SUMMARY = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol. It allows \
you to write programs that invoke and interact with processes on remote \
servers, via SSH2."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "ruby3.2-rubygem-net-ssh-7.0.1-2.5.aarch64.rpm"
RPM_HASH = "64200830896d120e5e7607c43b0be200bc11686aeef4ef673f187b28cd872d0774cf434878d5fd9bd0a3694cc445de813498b7f95d3c51a42da79efdd4a9cfa2"

RPROVIDES:${PN} += "ruby3.2-rubygem-net-ssh ruby3.2-rubygem-net-ssh(aarch-64) rubygem(net-ssh) rubygem(ruby:3.2.0:net-ssh) rubygem(ruby:3.2.0:net-ssh:7) rubygem(ruby:3.2.0:net-ssh:7.0) rubygem(ruby:3.2.0:net-ssh:7.0.1)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi)"

inherit rpm
