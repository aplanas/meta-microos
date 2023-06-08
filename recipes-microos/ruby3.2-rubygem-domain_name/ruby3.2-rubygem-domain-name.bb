SUMMARY = "Domain Name manipulation library for Ruby"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby. \
It can also be used for cookie domain validation based on the Public \
Suffix List."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "0.5.20190701"

RPM_NAME = "ruby3.2-rubygem-domain_name-0.5.20190701-1.17.aarch64.rpm"
RPM_HASH = "73e517dd2731323bd8f7b4f17c220c992169b5e38f01995f5c7f54529161d92e66eae1b3e2859b686ed4d762815f53e4e3d8b1e785e22b52075185c3627c2f44"

RPROVIDES:${PN} += "ruby3.2-rubygem-domain_name ruby3.2-rubygem-domain_name(aarch-64) rubygem(domain_name) rubygem(ruby:3.2.0:domain_name) rubygem(ruby:3.2.0:domain_name:0) rubygem(ruby:3.2.0:domain_name:0.5) rubygem(ruby:3.2.0:domain_name:0.5.20190701)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:unf)"

inherit rpm
