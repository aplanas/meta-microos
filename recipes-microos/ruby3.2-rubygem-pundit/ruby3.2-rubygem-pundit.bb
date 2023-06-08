SUMMARY = "OO authorization for Rails"
DESCRIPTION = "Object oriented authorization for Rails applications."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "ruby3.2-rubygem-pundit-2.2.0-1.9.aarch64.rpm"
RPM_HASH = "112d6e303ca038ac14ba2e0005630829f3f9f9c1e9ddb31d5cfd98218a776d14141d22c7fe5aeb772885bc13c692dfb9975d4f74acbcfc594d4197f4e85b94c2"

RPROVIDES:${PN} += "ruby3.2-rubygem-pundit ruby3.2-rubygem-pundit(aarch-64) rubygem(pundit) rubygem(ruby:3.2.0:pundit) rubygem(ruby:3.2.0:pundit:2) rubygem(ruby:3.2.0:pundit:2.2) rubygem(ruby:3.2.0:pundit:2.2.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:activesupport)"

inherit rpm
