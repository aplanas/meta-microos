SUMMARY = "Rails packaging support"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Rails packaging support files."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-common-rails-3.2-3.1.noarch.rpm"
RPM_HASH = "30a411cfe7c212a05a23842f09526d2964524f897feffecdd87ab79675039f531f8b4a0bb7d7eea92d278517a8f0659ce3ed518c6ae1825044542c6023f766c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(rails_fix_ruby_shebang) rpm_macro(rails_fix_ruby_suffix) rpm_macro(rails_regen_gemfile_lock) rpm_macro(rails_save_gemfile) rpm_macro(rails_write_appinfo) rpm_macro(ruby_fix_shebang) ruby-common-rails"
RDEPENDS:${PN} += "/bin/sh ruby-common rubygem(bundler)"

inherit rpm
