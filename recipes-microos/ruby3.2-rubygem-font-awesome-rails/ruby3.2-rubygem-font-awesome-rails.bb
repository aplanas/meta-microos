SUMMARY = "an asset gemification of the font-awesome icon font library"
DESCRIPTION = "font-awesome-rails provides the Font-Awesome web fonts and stylesheets as a \
Rails engine for use with the asset pipeline."
LICENSE = "MIT & OFL-1.1"

PV = "4.7.0.8"

RPM_NAME = "ruby3.2-rubygem-font-awesome-rails-4.7.0.8-1.9.aarch64.rpm"
RPM_HASH = "85bd4d18d97e88d7ad08431bf565a60c2fb86648699085a0922e85a432dbd6aa4d6164ede23919b67f1575ca7db90b4821fa1b42dea7bbb69ffd3b249c05f77b"

RPROVIDES:${PN} += "ruby3.2-rubygem-font-awesome-rails ruby3.2-rubygem-font-awesome-rails(aarch-64) rubygem(font-awesome-rails) rubygem(ruby:3.2.0:font-awesome-rails) rubygem(ruby:3.2.0:font-awesome-rails:4) rubygem(ruby:3.2.0:font-awesome-rails:4.7) rubygem(ruby:3.2.0:font-awesome-rails:4.7.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:railties)"

inherit rpm
