SUMMARY = "Use jQuery with Rails 4+"
DESCRIPTION = "This gem provides jQuery and the jQuery-ujs driver for your Rails 4+ \
application."
LICENSE = "MIT"

PV = "4.5.1"

RPM_NAME = "ruby3.2-rubygem-jquery-rails-4.5.1-1.3.aarch64.rpm"
RPM_HASH = "eb8f9c8b3b3ddebbb5e11e4072b85cca83b2adf188c2d337cc48480bf0c1ab446bd432e40eef1e2b0350347540f0b3fa6d4a22cbd59ed4cfc627ab4087dba6a3"

RPROVIDES:${PN} += "ruby3.2-rubygem-jquery-rails ruby3.2-rubygem-jquery-rails(aarch-64) rubygem(jquery-rails) rubygem(ruby:3.2.0:jquery-rails) rubygem(ruby:3.2.0:jquery-rails:4) rubygem(ruby:3.2.0:jquery-rails:4.5) rubygem(ruby:3.2.0:jquery-rails:4.5.1)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:rails-dom-testing) rubygem(ruby:3.2.0:railties) rubygem(ruby:3.2.0:thor)"

inherit rpm
