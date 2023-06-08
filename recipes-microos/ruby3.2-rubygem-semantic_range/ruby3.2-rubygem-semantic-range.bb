SUMMARY = "node-semver rewritten in ruby, for comparison and inclusion of"
DESCRIPTION = "node-semver rewritten in ruby, for comparison and inclusion of semantic \
versions and ranges."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "ruby3.2-rubygem-semantic_range-3.0.0-1.11.aarch64.rpm"
RPM_HASH = "06f76b8417bb771dcef93577278c7198121ca7231f996d2e9eb7442cff12262e32a74fcaf7559545fa27c0994f0309510ca5087288d426ddddd507f3bacf70b8"

RPROVIDES:${PN} += "ruby3.2-rubygem-semantic_range ruby3.2-rubygem-semantic_range(aarch-64) rubygem(ruby:3.2.0:semantic_range) rubygem(ruby:3.2.0:semantic_range:3) rubygem(ruby:3.2.0:semantic_range:3.0) rubygem(ruby:3.2.0:semantic_range:3.0.0) rubygem(semantic_range)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
