SUMMARY = "Run JavaScript code from Ruby"
DESCRIPTION = "ExecJS lets you run JavaScript code from Ruby."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "ruby3.2-rubygem-execjs-2.8.1-1.16.aarch64.rpm"
RPM_HASH = "e7e49c55de8a627981b0a7b9c3594f0cf003b07ed76e802476a72fe688293ef8a287458ff4a9a1c73f2dccfa5bc41d6c43a871b78046d9678c3658175395d15f"

RPROVIDES:${PN} += "ruby3.2-rubygem-execjs ruby3.2-rubygem-execjs(aarch-64) rubygem(execjs) rubygem(ruby:3.2.0:execjs) rubygem(ruby:3.2.0:execjs:2) rubygem(ruby:3.2.0:execjs:2.8) rubygem(ruby:3.2.0:execjs:2.8.1)"
RDEPENDS:${PN} += "nodejs ruby(abi)"

inherit rpm
