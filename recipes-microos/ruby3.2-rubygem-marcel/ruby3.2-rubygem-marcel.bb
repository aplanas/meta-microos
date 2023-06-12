SUMMARY = "Simple mime type detection using magic numbers, filenames, and"
DESCRIPTION = "Simple mime type detection using magic numbers, filenames, and extensions."
LICENSE = "MIT & Apache-2.0"

PV = "1.0.2"

RPM_NAME = "ruby3.2-rubygem-marcel-1.0.2-1.11.aarch64.rpm"
RPM_HASH = "92a89e13096c8a3a25dfdbb12bd5bdc551ec0549ddc51a09111ad0bb5603dec6a45752a3b14aaf00ca9959c455eeaffa6fb7ceed05cd1a4645876d965c84baf8"

RPROVIDES:${PN} += "ruby3.2-rubygem-marcel \
ruby3.2-rubygem-marcel(aarch-64) \
rubygem(marcel) \
rubygem(ruby:3.2.0:marcel) \
rubygem(ruby:3.2.0:marcel:1) \
rubygem(ruby:3.2.0:marcel:1.0) \
rubygem(ruby:3.2.0:marcel:1.0.2)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
