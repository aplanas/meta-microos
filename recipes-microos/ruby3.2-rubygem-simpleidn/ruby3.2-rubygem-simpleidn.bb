SUMMARY = "Punycode ACE to unicode UTF-8 (and vice-versa) string conversion"
DESCRIPTION = "This gem allows easy conversion from punycode ACE strings to unicode UTF-8 \
strings and vice-versa."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "ruby3.2-rubygem-simpleidn-0.2.1-1.13.aarch64.rpm"
RPM_HASH = "ba2c93ef7d41aff415898cd8e30464e99e8ec15244bfef88c46a5df95656b490b0a6c2689d0480619a9becebc22becc45137dc01a84e1b6eb01d0c03b52fe80b"

RPROVIDES:${PN} += "ruby3.2-rubygem-simpleidn \
ruby3.2-rubygem-simpleidn(aarch-64) \
rubygem(ruby:3.2.0:simpleidn) \
rubygem(ruby:3.2.0:simpleidn:0) \
rubygem(ruby:3.2.0:simpleidn:0.2) \
rubygem(ruby:3.2.0:simpleidn:0.2.1) \
rubygem(simpleidn)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:unf:0.1)"

inherit rpm
