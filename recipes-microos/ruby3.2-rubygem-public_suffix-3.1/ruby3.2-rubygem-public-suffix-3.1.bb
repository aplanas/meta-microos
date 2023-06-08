SUMMARY = "Domain name parser based on the Public Suffix List"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, \
domain and subdomains."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "ruby3.2-rubygem-public_suffix-3.1-3.1.1-1.17.aarch64.rpm"
RPM_HASH = "1ed9304305c19a2ab5f29a284b8b3567e4aa2bb339df82a38e551433a0317262994c8ada234c2dc0c08e56a4b71090614fcb6e1cc247a5e5e9bf96184cb7f58c"

RPROVIDES:${PN} += "ruby3.2-rubygem-public_suffix-3.1 ruby3.2-rubygem-public_suffix-3.1(aarch-64) rubygem(public_suffix) rubygem(ruby:3.2.0:public_suffix) rubygem(ruby:3.2.0:public_suffix:3) rubygem(ruby:3.2.0:public_suffix:3.1) rubygem(ruby:3.2.0:public_suffix:3.1.1)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi)"

inherit rpm
