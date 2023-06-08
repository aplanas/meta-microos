SUMMARY = "Simple FastGettext Rails integration"
DESCRIPTION = "Simple FastGettext Rails integration."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "ruby3.2-rubygem-gettext_i18n_rails-1.9.0-1.5.aarch64.rpm"
RPM_HASH = "797ba0fa1689abdfa85799976ee8e4858105d4a86eb8afd3bec1c6134a06e43b014d62b9bac9339910e6b8102514b1665c30c54a413e1e083369e8c2d5a08d26"

RPROVIDES:${PN} += "ruby3.2-rubygem-gettext_i18n_rails ruby3.2-rubygem-gettext_i18n_rails(aarch-64) rubygem(gettext_i18n_rails) rubygem(ruby:3.2.0:gettext_i18n_rails) rubygem(ruby:3.2.0:gettext_i18n_rails:1) rubygem(ruby:3.2.0:gettext_i18n_rails:1.9) rubygem(ruby:3.2.0:gettext_i18n_rails:1.9.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:fast_gettext)"

inherit rpm
