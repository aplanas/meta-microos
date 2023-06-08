SUMMARY = "Automatic Ruby code style checking tool"
DESCRIPTION = "RuboCop is a Ruby code style checking and code formatting tool. \
It aims to enforce the community-driven Ruby Style Guide."
LICENSE = "MIT"

PV = "1.39.0"

RPM_NAME = "ruby3.2-rubygem-rubocop-1.39.0-1.4.aarch64.rpm"
RPM_HASH = "61a1ba133a3ed9f01ec94b079fd0d2951ae146fc8914692ec237545941e7722295592bb355afcb48711e132d955614f1a68de7c7a464e16b08be584568e2c7bb"

RPROVIDES:${PN} += "ruby3.2-rubygem-rubocop ruby3.2-rubygem-rubocop(aarch-64) rubygem(rubocop) rubygem(ruby:3.2.0:rubocop) rubygem(ruby:3.2.0:rubocop:1) rubygem(ruby:3.2.0:rubocop:1.39) rubygem(ruby:3.2.0:rubocop:1.39.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:json:2) rubygem(ruby:3.2.0:parallel:1) rubygem(ruby:3.2.0:parser) rubygem(ruby:3.2.0:rainbow) rubygem(ruby:3.2.0:regexp_parser) rubygem(ruby:3.2.0:rexml) rubygem(ruby:3.2.0:rubocop-ast) rubygem(ruby:3.2.0:ruby-progressbar:1) rubygem(ruby:3.2.0:unicode-display_width) update-alternatives"

inherit rpm
