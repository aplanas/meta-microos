SUMMARY = "Builders for MarkUp"
DESCRIPTION = "Builder provides a number of builder objects that make creating structured \
data \
simple to do.  Currently the following builder objects are supported: \
* XML Markup \
* XML Events."
LICENSE = "MIT"

PV = "3.2.4"

RPM_NAME = "ruby3.2-rubygem-builder-3.2.4-1.17.aarch64.rpm"
RPM_HASH = "88d8edf5724d5025ef7c8197ac11716ff9888127480ba5f2b51629aa8536d2767b8feec789a02e0e3eba30c035f490585e81ca04350bb92bb344cabdc3fd2d52"

RPROVIDES:${PN} += "ruby3.2-rubygem-builder ruby3.2-rubygem-builder(aarch-64) rubygem(builder) rubygem(ruby:3.2.0:builder) rubygem(ruby:3.2.0:builder:3) rubygem(ruby:3.2.0:builder:3.2) rubygem(ruby:3.2.0:builder:3.2.4)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
