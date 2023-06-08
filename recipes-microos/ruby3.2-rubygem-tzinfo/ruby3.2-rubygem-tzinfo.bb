SUMMARY = "Time Zone Library"
DESCRIPTION = "TZInfo provides access to time zone data and allows times to be converted \
using time zone rules."
LICENSE = "MIT"

PV = "2.0.5"

RPM_NAME = "ruby3.2-rubygem-tzinfo-2.0.5-1.5.aarch64.rpm"
RPM_HASH = "4a7b92a749c2903c7e42b7dbf492756cfc05459cefb4b309e7c4cfc593f738e74050e86325f8e899a5cb2b2e7c3c3b4042d11cbdc1c42677ebde88c913628907"

RPROVIDES:${PN} += "ruby3.2-rubygem-tzinfo ruby3.2-rubygem-tzinfo(aarch-64) rubygem(ruby:3.2.0:tzinfo) rubygem(ruby:3.2.0:tzinfo:2) rubygem(ruby:3.2.0:tzinfo:2.0) rubygem(ruby:3.2.0:tzinfo:2.0.5) rubygem(tzinfo)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:concurrent-ruby:1) timezone"

inherit rpm
