SUMMARY = "Your personal string matching expert"
DESCRIPTION = "A library implementing patterns that behave like regular expressions."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "ruby3.2-rubygem-mustermann-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "6c2c05eee9ab4d7c121e7c1db268c0cb194795742ebd6feed80193522d9c154c0035bb1d7fd3e4695c4c56949b39221f88ff546ac2b8e54ba1a1c861ff0d8c5b"

RPROVIDES:${PN} += "ruby3.2-rubygem-mustermann \
ruby3.2-rubygem-mustermann(aarch-64) \
rubygem(mustermann) \
rubygem(ruby:3.2.0:mustermann) \
rubygem(ruby:3.2.0:mustermann:3) \
rubygem(ruby:3.2.0:mustermann:3.0) \
rubygem(ruby:3.2.0:mustermann:3.0.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:ruby2_keywords:0.0)"

inherit rpm
