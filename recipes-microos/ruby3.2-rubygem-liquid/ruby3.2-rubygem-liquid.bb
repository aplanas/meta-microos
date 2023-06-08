SUMMARY = "A secure, non-evaling end user template engine with aesthetic markup"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
LICENSE = "MIT"

PV = "5.4.0"

RPM_NAME = "ruby3.2-rubygem-liquid-5.4.0-2.5.aarch64.rpm"
RPM_HASH = "b63a58542e4cb5f83233fb7afc9609667adcbf1b16c3a65665321ae5530b4901a0d7e5873b08f70fbe122364ca477cdffa268a52dc812ef8d70afc4cc98ba7c6"

RPROVIDES:${PN} += "ruby3.2-rubygem-liquid ruby3.2-rubygem-liquid(aarch-64) rubygem(liquid) rubygem(ruby:3.2.0:liquid) rubygem(ruby:3.2.0:liquid:5) rubygem(ruby:3.2.0:liquid:5.4) rubygem(ruby:3.2.0:liquid:5.4.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
