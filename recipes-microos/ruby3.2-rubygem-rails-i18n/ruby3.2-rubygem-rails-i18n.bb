SUMMARY = "Common locale data and translations for Rails i18n"
DESCRIPTION = "A set of common locale data and translations to internationalize and/or \
localize your Rails applications."
LICENSE = "MIT"

PV = "7.0.6"

RPM_NAME = "ruby3.2-rubygem-rails-i18n-7.0.6-1.3.aarch64.rpm"
RPM_HASH = "cc1ef99b06ae4e92e7cc69bb8775364a8fc0112ce56926845bbb446dd488b02bcf4bf0da5ea413da02e810d13b1846ddf1277ee5c6ebbaa0ada1505a8e95928d"

RPROVIDES:${PN} += "ruby3.2-rubygem-rails-i18n ruby3.2-rubygem-rails-i18n(aarch-64) rubygem(rails-i18n) rubygem(ruby:3.2.0:rails-i18n) rubygem(ruby:3.2.0:rails-i18n:7) rubygem(ruby:3.2.0:rails-i18n:7.0) rubygem(ruby:3.2.0:rails-i18n:7.0.6)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:i18n) rubygem(ruby:3.2.0:railties)"

inherit rpm
