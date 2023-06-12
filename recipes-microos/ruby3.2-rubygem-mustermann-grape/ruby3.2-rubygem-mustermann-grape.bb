SUMMARY = "Grape syntax for Mustermann"
DESCRIPTION = "Adds Grape style patterns to Mustermman."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "ruby3.2-rubygem-mustermann-grape-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "437299ecebf342ebc8372cd6e2deb8570b16d30142dd6ffd214c604d5b52db5e33344468c034e36217eda5465acce034f74c2ae02bfeb099885361ce25e8490f"

RPROVIDES:${PN} += "ruby3.2-rubygem-mustermann-grape \
ruby3.2-rubygem-mustermann-grape(aarch-64) \
rubygem(mustermann-grape) \
rubygem(ruby:3.2.0:mustermann-grape) \
rubygem(ruby:3.2.0:mustermann-grape:1) \
rubygem(ruby:3.2.0:mustermann-grape:1.0) \
rubygem(ruby:3.2.0:mustermann-grape:1.0.2)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:mustermann)"

inherit rpm
