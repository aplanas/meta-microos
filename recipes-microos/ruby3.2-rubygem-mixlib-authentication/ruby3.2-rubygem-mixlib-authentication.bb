SUMMARY = "Mixes in simple per-request authentication"
DESCRIPTION = "Mixes in simple per-request authentication."
LICENSE = "Apache-2.0"

PV = "3.0.10"

RPM_NAME = "ruby3.2-rubygem-mixlib-authentication-3.0.10-1.11.aarch64.rpm"
RPM_HASH = "d9051aa4c6e929b60a1707a5593fb00dd137c2d538b538b4a609d05b9f660fdbd5d4c37ec0eb7d40d04a24aec643f0aff9337fdb4e2563805030d054d3e1f301"

RPROVIDES:${PN} += "ruby3.2-rubygem-mixlib-authentication ruby3.2-rubygem-mixlib-authentication(aarch-64) rubygem(mixlib-authentication) rubygem(ruby:3.2.0:mixlib-authentication) rubygem(ruby:3.2.0:mixlib-authentication:3) rubygem(ruby:3.2.0:mixlib-authentication:3.0) rubygem(ruby:3.2.0:mixlib-authentication:3.0.10)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
