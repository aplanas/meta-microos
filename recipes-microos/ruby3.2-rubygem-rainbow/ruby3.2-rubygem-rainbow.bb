SUMMARY = "Colorize printed text on ANSI terminals"
DESCRIPTION = "Colorize printed text on ANSI terminals."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "ruby3.2-rubygem-rainbow-3.1.1-1.9.aarch64.rpm"
RPM_HASH = "b2d413474384c3f6b05b99e5ef3ae898fd25b9ac380c672166312b900939d958ca8ba829208ac47160614dbf956e1f5855cb3e23b60c36810b0cefd010af63e3"

RPROVIDES:${PN} += "ruby3.2-rubygem-rainbow \
ruby3.2-rubygem-rainbow(aarch-64) \
rubygem(rainbow) \
rubygem(ruby:3.2.0:rainbow) \
rubygem(ruby:3.2.0:rainbow:3) \
rubygem(ruby:3.2.0:rainbow:3.1) \
rubygem(ruby:3.2.0:rainbow:3.1.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
