SUMMARY = "Dom and Selector assertions for Rails applications"
DESCRIPTION = "This gem can compare doms and assert certain elements exists in doms using \
Nokogiri. ."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "ruby3.2-rubygem-rails-dom-testing-2.0.3-1.27.aarch64.rpm"
RPM_HASH = "27b61edb43216a4c8674942a8a0549bd993fd1c6f759f5085711391685dacb970ffb0bf86828aa4bb27673cf9b1535923453b2fed50c815a75d8951bcbe288db"

RPROVIDES:${PN} += "ruby3.2-rubygem-rails-dom-testing ruby3.2-rubygem-rails-dom-testing(aarch-64) rubygem(rails-dom-testing) rubygem(ruby:3.2.0:rails-dom-testing) rubygem(ruby:3.2.0:rails-dom-testing:2) rubygem(ruby:3.2.0:rails-dom-testing:2.0) rubygem(ruby:3.2.0:rails-dom-testing:2.0.3)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:activesupport) rubygem(ruby:3.2.0:nokogiri)"

inherit rpm
