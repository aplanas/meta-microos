SUMMARY = "Fast mime detection by extension or content"
DESCRIPTION = "Fast mime detection by extension or content (Uses freedesktop.org.xml \
shared-mime-info database)."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "ruby3.2-rubygem-mimemagic-0.4.3-1.9.aarch64.rpm"
RPM_HASH = "18488306e24350032232008ab37e5bdc06e6d60523575255f3af530f7c42afd7b1351b7cdf8bf9b8a0ecc002a876067801696864421b5362324c31bfcbb3721b"

RPROVIDES:${PN} += "ruby3.2-rubygem-mimemagic ruby3.2-rubygem-mimemagic(aarch-64) rubygem(mimemagic) rubygem(ruby:3.2.0:mimemagic) rubygem(ruby:3.2.0:mimemagic:0) rubygem(ruby:3.2.0:mimemagic:0.4) rubygem(ruby:3.2.0:mimemagic:0.4.3)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:nokogiri) rubygem(ruby:3.2.0:rake) shared-mime-info"

inherit rpm
