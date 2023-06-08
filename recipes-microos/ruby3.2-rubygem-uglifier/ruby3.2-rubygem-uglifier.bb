SUMMARY = "Ruby wrapper for UglifyJS JavaScript compressor"
DESCRIPTION = "Uglifier minifies JavaScript files by wrapping UglifyJS to be accessible in \
Ruby."
LICENSE = "MIT & BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "ruby3.2-rubygem-uglifier-4.2.0-1.22.aarch64.rpm"
RPM_HASH = "ef7b3ed3c584b9eb1453dcb44358198f0fdb485429ca927bbdbe42763c97fbd0663ab271002efe88f535a9078f5118f9335811634c1eb8792ea450342dbb7525"

RPROVIDES:${PN} += "ruby3.2-rubygem-uglifier ruby3.2-rubygem-uglifier(aarch-64) rubygem(ruby:3.2.0:uglifier) rubygem(ruby:3.2.0:uglifier:4) rubygem(ruby:3.2.0:uglifier:4.2) rubygem(ruby:3.2.0:uglifier:4.2.0) rubygem(uglifier)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:execjs)"

inherit rpm
