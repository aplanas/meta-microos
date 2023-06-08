SUMMARY = "Attributes on Steroids for Plain Old Ruby Objects"
DESCRIPTION = "Attributes on Steroids for Plain Old Ruby Objects."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "ruby3.2-rubygem-virtus-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "3e190dd0788b41849942c344b039b80f7e8539dc09b79db979112974b53ced40fc9d427abefbbcee2c95080e3a61db48fb081536770211dd2554eb6b60572acd"

RPROVIDES:${PN} += "ruby3.2-rubygem-virtus ruby3.2-rubygem-virtus(aarch-64) rubygem(ruby:3.2.0:virtus) rubygem(ruby:3.2.0:virtus:2) rubygem(ruby:3.2.0:virtus:2.0) rubygem(ruby:3.2.0:virtus:2.0.0) rubygem(virtus)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:axiom-types:0) rubygem(ruby:3.2.0:coercible:1) rubygem(ruby:3.2.0:descendants_tracker) rubygem(ruby:3.2.0:descendants_tracker:0)"

inherit rpm
