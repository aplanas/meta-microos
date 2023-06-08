SUMMARY = "Ruby WebFinger client library, following IETF WebFinger WG spec"
DESCRIPTION = "Ruby WebFinger client library."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "ruby3.2-rubygem-webfinger-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "5875c8cdb07f07a8a2425cd9df8e44e53533fae39330d331e16ff2afe1761ae94d5f6ce87fd6c5b206e1e6b6d9f7df6091c384b13da44767a6995b25f89dc0d7"

RPROVIDES:${PN} += "ruby3.2-rubygem-webfinger ruby3.2-rubygem-webfinger(aarch-64) rubygem(ruby:3.2.0:webfinger) rubygem(ruby:3.2.0:webfinger:2) rubygem(ruby:3.2.0:webfinger:2.1) rubygem(ruby:3.2.0:webfinger:2.1.2) rubygem(webfinger)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:activesupport) rubygem(ruby:3.2.0:faraday-follow_redirects) rubygem(ruby:3.2.0:faraday:2)"

inherit rpm
