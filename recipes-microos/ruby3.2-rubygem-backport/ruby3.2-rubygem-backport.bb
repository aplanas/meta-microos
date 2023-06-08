SUMMARY = "A pure Ruby library for event-driven IO"
DESCRIPTION = "A pure Ruby library for event-driven IO."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ruby3.2-rubygem-backport-1.2.0-1.11.aarch64.rpm"
RPM_HASH = "df80d4fdd208af67e5cfc368fdbd77956b3f2b95ec67fa62853c94615d79dd5e51e0a27bcce4666962588663c94e27091035c10e44ed2cceac06ff7176bc4c37"

RPROVIDES:${PN} += "ruby3.2-rubygem-backport ruby3.2-rubygem-backport(aarch-64) rubygem(backport) rubygem(ruby:3.2.0:backport) rubygem(ruby:3.2.0:backport:1) rubygem(ruby:3.2.0:backport:1.2) rubygem(ruby:3.2.0:backport:1.2.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
