SUMMARY = "Ruby CSS parser"
DESCRIPTION = "A set of classes for parsing CSS in Ruby."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "ruby3.2-rubygem-css_parser-1.12.0-1.5.aarch64.rpm"
RPM_HASH = "e100791ed98b53cca7990d26fa81b22b50208c3a6a3eb9948eb6c57211599566e7c783c9eaa8018ba360fa82e55878b750598527c838d27d8d0b5f5ed4cd65db"

RPROVIDES:${PN} += "ruby3.2-rubygem-css_parser ruby3.2-rubygem-css_parser(aarch-64) rubygem(css_parser) rubygem(ruby:3.2.0:css_parser) rubygem(ruby:3.2.0:css_parser:1) rubygem(ruby:3.2.0:css_parser:1.12) rubygem(ruby:3.2.0:css_parser:1.12.0)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:addressable)"

inherit rpm
