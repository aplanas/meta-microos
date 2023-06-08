SUMMARY = "A library for consuming and serving OpenID identities"
DESCRIPTION = "A library for consuming and serving OpenID identities."
LICENSE = "Ruby & Apache-2.0"

PV = "2.9.2"

RPM_NAME = "ruby3.2-rubygem-ruby-openid-2.9.2-1.17.aarch64.rpm"
RPM_HASH = "e67c819484fcf329af56d62f982b794078e3b064375d1941a513682692e7e58b7416736227cd837b307c0cfcd695b1783b1a6f30f227423ae3e0a13d2606b362"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby-openid ruby3.2-rubygem-ruby-openid(aarch-64) rubygem(ruby-openid) rubygem(ruby:3.2.0:ruby-openid) rubygem(ruby:3.2.0:ruby-openid:2) rubygem(ruby:3.2.0:ruby-openid:2.9) rubygem(ruby:3.2.0:ruby-openid:2.9.2)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi)"

inherit rpm
