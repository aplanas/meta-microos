SUMMARY = "JSON formatter for SimpleCov"
DESCRIPTION = "JSON formatter for SimpleCov."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ruby3.2-rubygem-simplecov_json_formatter-0.1.4-1.9.aarch64.rpm"
RPM_HASH = "fb2a4451c884047772314d36fd8338c32576e2eab3bde8a7eea0794d61dc02ffb765888c35e16120f6fe3300c5649df4bb61232bbbc0a7d8f47b18f304909ade"

RPROVIDES:${PN} += "ruby3.2-rubygem-simplecov_json_formatter ruby3.2-rubygem-simplecov_json_formatter(aarch-64) rubygem(ruby:3.2.0:simplecov_json_formatter) rubygem(ruby:3.2.0:simplecov_json_formatter:0) rubygem(ruby:3.2.0:simplecov_json_formatter:0.1) rubygem(ruby:3.2.0:simplecov_json_formatter:0.1.4) rubygem(simplecov_json_formatter)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
