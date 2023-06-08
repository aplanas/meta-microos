SUMMARY = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol. It allows \
you to write programs that invoke and interact with processes on remote \
servers, via SSH2."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "ruby3.2-rubygem-net-ssh-6.1-6.1.0-1.11.aarch64.rpm"
RPM_HASH = "f526c0ac9adbde9e3534f2ee7b9af92020e6a1b96ab6d5995065013b7348b5900c928c8d4d0de3b0f60916dea6d9537cf2ab99f9fe78f34bee5e19749b969d68"

RPROVIDES:${PN} += "ruby3.2-rubygem-net-ssh-6.1 ruby3.2-rubygem-net-ssh-6.1(aarch-64) rubygem(net-ssh) rubygem(ruby:3.2.0:net-ssh) rubygem(ruby:3.2.0:net-ssh:6) rubygem(ruby:3.2.0:net-ssh:6.1) rubygem(ruby:3.2.0:net-ssh:6.1.0)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi)"

inherit rpm
