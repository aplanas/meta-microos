SUMMARY = "Collection of scripts and macros for ruby packaging"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-common-3.2-3.1.noarch.rpm"
RPM_HASH = "aba243930470ee3e6b954685bdd0dacde339614b56d302b048eafa5d4692f487b5834cd233ebe7748c6e37ef0d6b0760b7f28442b2bf4f9dd32269ea4c44558a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ruby-common) rpm_macro(gem_base) rpm_macro(gem_build) rpm_macro(gem_cleanup) rpm_macro(gem_doc_ext) rpm_macro(gem_extensions) rpm_macro(gem_install) rpm_macro(gem_packages) rpm_macro(gem_platform) rpm_macro(gem_unpack) rpm_macro(rb_arch) rpm_macro(rb_archdir) rpm_macro(rb_binary) rpm_macro(rb_dir) rpm_macro(rb_libdir) rpm_macro(rb_sitearch) rpm_macro(rb_sitearchdir) rpm_macro(rb_sitedir) rpm_macro(rb_sitelib) rpm_macro(rb_sitelibdir) rpm_macro(rb_vendorarch) rpm_macro(rb_vendorarchdir) rpm_macro(rb_vendordir) rpm_macro(rb_vendorlib) rpm_macro(rb_vendorlibdir) rpm_macro(rb_ver) rpm_macro(ruby) rpm_macro(rubySTOP) rpm_macro(rubydevel) rpm_macro(rubydevelSTOP) rpm_macro(rubydevelxSTOP) rpm_macro(rubygem) rpm_macro(rubygemsSTOP) rpm_macro(rubygems_requires) rpm_macro(rubygemsxSTOP) rpm_macro(rubygemsxxSTOP) rpm_macro(rubyxSTOP) rpm_macro(set_gem_binary) ruby-common ruby-macros"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/getopt fdupes rubygem(gem2rpm) util-linux"

inherit rpm
