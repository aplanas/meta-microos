SUMMARY = "Protect against typical web attacks, works with all Rack apps,"
DESCRIPTION = "Protect against typical web attacks, works with all Rack apps, including \
Rails."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "ruby3.2-rubygem-rack-protection-3.0.4-1.3.aarch64.rpm"
RPM_HASH = "8e07d661c40bdf0b0d4e95bd0bc39aae3658d899c517c428a53408f221adac23750e99a75be40564fdee0f94b9fa4848bd590808f708e88a678b52b082f566b8"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-protection \
ruby3.2-rubygem-rack-protection(aarch-64) \
rubygem(rack-protection) \
rubygem(ruby:3.2.0:rack-protection) \
rubygem(ruby:3.2.0:rack-protection:3) \
rubygem(ruby:3.2.0:rack-protection:3.0) \
rubygem(ruby:3.2.0:rack-protection:3.0.4)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:rack)"

inherit rpm
