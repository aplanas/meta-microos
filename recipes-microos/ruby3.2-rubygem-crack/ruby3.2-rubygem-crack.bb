SUMMARY = "Really simple JSON and XML parsing, ripped from Merb and Rails"
DESCRIPTION = "Really simple JSON and XML parsing, ripped from Merb and Rails."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "ruby3.2-rubygem-crack-0.4.5-1.13.aarch64.rpm"
RPM_HASH = "94ba34d5ad0207dd1dd72dace3e6ab861215310cf24b25ced77e13aadf72abd543d30349f70b3fbb15a25948e82fc05f120c3242645c5d7c3bfbbc3c1be32004"

RPROVIDES:${PN} += "ruby3.2-rubygem-crack \
ruby3.2-rubygem-crack(aarch-64) \
rubygem(crack) \
rubygem(ruby:3.2.0:crack) \
rubygem(ruby:3.2.0:crack:0) \
rubygem(ruby:3.2.0:crack:0.4) \
rubygem(ruby:3.2.0:crack:0.4.5)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:rexml)"

inherit rpm
