SUMMARY = "Almost like Pathname but just a little less insane"
DESCRIPTION = "Like Pathname but a little less insane."
LICENSE = "MIT"

PV = "0.16.2"

RPM_NAME = "ruby3.2-rubygem-pathutil-0.16.2-1.20.aarch64.rpm"
RPM_HASH = "34e811826a9805e85678bc785f201caa72560adff9447b25b23d3a33172441906ee8a418e72e997c18a99c7812e7baf586b33af2c99a89303917ea95b5fd3d4b"

RPROVIDES:${PN} += "ruby3.2-rubygem-pathutil \
ruby3.2-rubygem-pathutil(aarch-64) \
rubygem(pathutil) \
rubygem(ruby:3.2.0:pathutil) \
rubygem(ruby:3.2.0:pathutil:0) \
rubygem(ruby:3.2.0:pathutil:0.16) \
rubygem(ruby:3.2.0:pathutil:0.16.2)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:forwardable-extended:2)"

inherit rpm
