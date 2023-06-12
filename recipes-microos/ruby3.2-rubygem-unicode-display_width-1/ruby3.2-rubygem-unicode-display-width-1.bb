SUMMARY = "Determines the monospace display width of a string in Ruby"
DESCRIPTION = "[Unicode 14.0.0] Determines the monospace display width of a string using \
EastAsianWidth.txt, Unicode general category, and other data."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "ruby3.2-rubygem-unicode-display_width-1-1.8.0-1.9.aarch64.rpm"
RPM_HASH = "bd0b78d1155d559e37ad5371e147dc67f6f7156ba701714d8b26cabf1ae6d67a0144ea51e4bf4a68b2d958b74a27d87a3e1f03178e45f1ece2f5c9631e50ffec"

RPROVIDES:${PN} += "ruby3.2-rubygem-unicode-display_width-1 \
ruby3.2-rubygem-unicode-display_width-1(aarch-64) \
rubygem(ruby:3.2.0:unicode-display_width) \
rubygem(ruby:3.2.0:unicode-display_width:1) \
rubygem(ruby:3.2.0:unicode-display_width:1.8) \
rubygem(ruby:3.2.0:unicode-display_width:1.8.0) \
rubygem(unicode-display_width)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
