SUMMARY = "Full-stack web application framework"
DESCRIPTION = "Ruby on Rails is a full-stack web framework optimized for programmer happiness \
and sustainable productivity. It encourages beautiful code by favoring \
convention over configuration."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-rails-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "33d56f80b564fd2b1314ad2f0ba5739d636a83fa0895c64f77d2c9017578f439c5e4f20d6dcf2ae4812a663b9cddeac51237bf84b72eb669ef49091a606009e7"

RPROVIDES:${PN} += "ruby3.2-rubygem-rails-7.0 ruby3.2-rubygem-rails-7.0(aarch-64) rubygem(rails) rubygem(ruby:3.2.0:rails) rubygem(ruby:3.2.0:rails:7) rubygem(ruby:3.2.0:rails:7.0) rubygem(ruby:3.2.0:rails:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:actioncable) rubygem(ruby:3.2.0:actionmailbox) rubygem(ruby:3.2.0:actionmailer) rubygem(ruby:3.2.0:actionpack) rubygem(ruby:3.2.0:actiontext) rubygem(ruby:3.2.0:actionview) rubygem(ruby:3.2.0:activejob) rubygem(ruby:3.2.0:activemodel) rubygem(ruby:3.2.0:activerecord) rubygem(ruby:3.2.0:activestorage) rubygem(ruby:3.2.0:activesupport) rubygem(ruby:3.2.0:bootsnap) rubygem(ruby:3.2.0:bundler) rubygem(ruby:3.2.0:importmap-rails) rubygem(ruby:3.2.0:jbuilder) rubygem(ruby:3.2.0:puma:5) rubygem(ruby:3.2.0:railties) rubygem(ruby:3.2.0:sprockets) rubygem(ruby:3.2.0:sprockets-rails) rubygem(ruby:3.2.0:sqlite3:1) rubygem(ruby:3.2.0:stimulus-rails) rubygem(ruby:3.2.0:turbo-rails) rubygem(ruby:3.2.0:web-console)"

inherit rpm
