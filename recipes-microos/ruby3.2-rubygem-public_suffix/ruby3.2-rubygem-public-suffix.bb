SUMMARY = "Domain name parser based on the Public Suffix List"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, \
domain and subdomains."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ruby3.2-rubygem-public_suffix-5.0.0-1.5.aarch64.rpm"
RPM_HASH = "8d587564b7522ba50f9e9d3bdfb468d401f2bef264f746703f21034d98a598d37fdcd4f22c1394bd05a3ce29a282c5d8cfb46a63f080459b988020b88b4b561d"

RPROVIDES:${PN} += "ruby3.2-rubygem-public_suffix ruby3.2-rubygem-public_suffix(aarch-64) rubygem(public_suffix) rubygem(ruby:3.2.0:public_suffix) rubygem(ruby:3.2.0:public_suffix:5) rubygem(ruby:3.2.0:public_suffix:5.0) rubygem(ruby:3.2.0:public_suffix:5.0.0)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi)"

inherit rpm
