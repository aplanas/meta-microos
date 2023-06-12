SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "python311-ruamel.yaml.clib-0.2.7-2.1.aarch64.rpm"
RPM_HASH = "a2812a488e6943ac1a3d0b61f0b01f7b77c67b4e2d24ea7c4560471685c1b7ecef5525be6b8e881691ab5fc4ba8b0019901d43d03ddcef384c29920afecbb9d2"

RPROVIDES:${PN} += "python3.11dist(ruamel.yaml.clib) \
python311-ruamel.yaml.clib \
python311-ruamel.yaml.clib(aarch-64) \
python3dist(ruamel.yaml.clib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
