SUMMARY = "Code coverage for Ruby"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic \
merging of coverage across test suites."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "ruby3.2-rubygem-simplecov-0.21.2-1.13.aarch64.rpm"
RPM_HASH = "75871483eea481b55652ee1aea64c0d02ae682690bfecac7d81ac089b1c2bcdfb6557f492851f05f462982dc76d7282f97bffae46037e4354c0b9199a031558c"

RPROVIDES:${PN} += "ruby3.2-rubygem-simplecov ruby3.2-rubygem-simplecov(aarch-64) rubygem(ruby:3.2.0:simplecov) rubygem(ruby:3.2.0:simplecov:0) rubygem(ruby:3.2.0:simplecov:0.21) rubygem(ruby:3.2.0:simplecov:0.21.2) rubygem(simplecov)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:docile:1) rubygem(ruby:3.2.0:simplecov-html:0) rubygem(ruby:3.2.0:simplecov_json_formatter:0)"

inherit rpm
