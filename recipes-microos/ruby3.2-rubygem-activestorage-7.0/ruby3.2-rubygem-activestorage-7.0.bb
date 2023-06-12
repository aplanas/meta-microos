SUMMARY = "Local and cloud file storage framework"
DESCRIPTION = "Attach cloud and local files in Rails applications."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-activestorage-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "58f947327a82a09ce88316f5749e953b04389eb57b493315b6a53dba58c987d459b4610bc6791bd62713ecd814675361e1e652c8d58cd5ac6c4f73304c9b5a77"

RPROVIDES:${PN} += "ruby3.2-rubygem-activestorage-7.0 \
ruby3.2-rubygem-activestorage-7.0(aarch-64) \
rubygem(activestorage) \
rubygem(ruby:3.2.0:activestorage) \
rubygem(ruby:3.2.0:activestorage:7) \
rubygem(ruby:3.2.0:activestorage:7.0) \
rubygem(ruby:3.2.0:activestorage:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activejob) \
rubygem(ruby:3.2.0:activerecord) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:marcel:1) \
rubygem(ruby:3.2.0:mini_mime)"

inherit rpm
