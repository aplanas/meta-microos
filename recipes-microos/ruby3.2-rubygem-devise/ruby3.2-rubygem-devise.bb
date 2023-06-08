SUMMARY = "Flexible authentication solution for Rails with Warden"
DESCRIPTION = "Flexible authentication solution for Rails with Warden."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "ruby3.2-rubygem-devise-4.8.1-1.9.aarch64.rpm"
RPM_HASH = "733aab4de32a2db8aca6e49ecf669f31a6d30e38a0dfdb6f3f8213fa1db10f4a7d63eef3b579bdc6d1d3888f249d50ee97a7c8d3f25148ea5e7990d7485a9f58"

RPROVIDES:${PN} += "ruby3.2-rubygem-devise ruby3.2-rubygem-devise(aarch-64) rubygem(devise) rubygem(ruby:3.2.0:devise) rubygem(ruby:3.2.0:devise:4) rubygem(ruby:3.2.0:devise:4.8) rubygem(ruby:3.2.0:devise:4.8.1)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:bcrypt:3) rubygem(ruby:3.2.0:orm_adapter:0) rubygem(ruby:3.2.0:railties) rubygem(ruby:3.2.0:responders) rubygem(ruby:3.2.0:warden:1.2)"

inherit rpm
