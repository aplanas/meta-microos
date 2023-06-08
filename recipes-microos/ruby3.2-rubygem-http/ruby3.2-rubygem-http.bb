SUMMARY = "HTTP should be easy"
DESCRIPTION = "An easy-to-use client library for making requests from Ruby. It uses a simple \
method chaining system for building requests, similar to Python's Requests."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "ruby3.2-rubygem-http-5.1.0-1.5.aarch64.rpm"
RPM_HASH = "802e09855236042771f7cea924c13492d722e39cbd9a85246beb1c4e95fb14570f3b6c7e1aaa3b2d5311f8ec5991c1779bf4a3ecdd62ce6d4e7d377e8c93c0b6"

RPROVIDES:${PN} += "ruby3.2-rubygem-http ruby3.2-rubygem-http(aarch-64) rubygem(http) rubygem(ruby:3.2.0:http) rubygem(ruby:3.2.0:http:5) rubygem(ruby:3.2.0:http:5.1) rubygem(ruby:3.2.0:http:5.1.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:addressable:2) rubygem(ruby:3.2.0:http-cookie:1) rubygem(ruby:3.2.0:http-form_data:2) rubygem(ruby:3.2.0:llhttp-ffi:0.4)"

inherit rpm
