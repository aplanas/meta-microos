SUMMARY = "Use ESM with importmap to manage modern JavaScript in Rails without"
DESCRIPTION = "Use ESM with importmap to manage modern JavaScript in Rails without \
transpiling or bundling."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "ruby3.2-rubygem-importmap-rails-1.1.5-1.5.aarch64.rpm"
RPM_HASH = "95d87ea89f469a6d574c3242a3969b58fafa057f6426c95afeaf530034f18593cf620fa7f93199c9e5291cb825dc993f1d823a3dc9685d9a75995817f7b9663c"

RPROVIDES:${PN} += "ruby3.2-rubygem-importmap-rails ruby3.2-rubygem-importmap-rails(aarch-64) rubygem(importmap-rails) rubygem(ruby:3.2.0:importmap-rails) rubygem(ruby:3.2.0:importmap-rails:1) rubygem(ruby:3.2.0:importmap-rails:1.1) rubygem(ruby:3.2.0:importmap-rails:1.1.5)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:actionpack) rubygem(ruby:3.2.0:railties)"

inherit rpm
