SUMMARY = "ICU integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the ICU library."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "libharfbuzz-icu0-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "8828c2af59a87c322976de2b501f4317bf2540467082139ce38e929b1ec281b8632f993c218576404f4cd6d997bc8f3995c591ddc1d20b96f5e8f3bf7497e284"

RPROVIDES:${PN} += "libharfbuzz-icu.so.0()(64bit) libharfbuzz-icu0 libharfbuzz-icu0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libharfbuzz.so.0()(64bit) libicuuc.so.72()(64bit)"

inherit rpm
