SUMMARY = "A class based configuration library"
DESCRIPTION = "A class based configuration library."
LICENSE = "Apache-2.0"

PV = "3.0.27"

RPM_NAME = "ruby3.2-rubygem-mixlib-config-3.0.27-1.5.aarch64.rpm"
RPM_HASH = "d83647514db446585e4df975a6762ae15b5aa0fc1fb6d236b3fbefe025ce41ac8ff9191a2caaafa074011ba96ca80d05850ace4ad7867ce76b0f2c8c452c7439"

RPROVIDES:${PN} += "ruby3.2-rubygem-mixlib-config ruby3.2-rubygem-mixlib-config(aarch-64) rubygem(mixlib-config) rubygem(ruby:3.2.0:mixlib-config) rubygem(ruby:3.2.0:mixlib-config:3) rubygem(ruby:3.2.0:mixlib-config:3.0) rubygem(ruby:3.2.0:mixlib-config:3.0.27)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:tomlrb)"

inherit rpm
