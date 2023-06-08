SUMMARY = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+"
DESCRIPTION = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+."
LICENSE = "MIT"

PV = "0.12.3"

RPM_NAME = "ruby3.2-rubygem-simplecov-html-0.12.3-1.15.aarch64.rpm"
RPM_HASH = "3633aad7733c3e050e3552d0c9078dab369a1bf5dde559838487505c378d3b1bfa72be7e4a8e014df2e8066b6a406d23b8f3c5849979c10d5f82286bca202061"

RPROVIDES:${PN} += "ruby3.2-rubygem-simplecov-html ruby3.2-rubygem-simplecov-html(aarch-64) rubygem(ruby:3.2.0:simplecov-html) rubygem(ruby:3.2.0:simplecov-html:0) rubygem(ruby:3.2.0:simplecov-html:0.12) rubygem(ruby:3.2.0:simplecov-html:0.12.3) rubygem(simplecov-html)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
