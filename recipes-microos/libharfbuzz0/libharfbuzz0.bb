SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "libharfbuzz0-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "19bc360dc669fede2938b5ad5fd7fa974967e8851eb99d90ab0098b8b5674890a6b9d10da3b9dff1c9a9cd68e3a9bf96e3176ebcea62b0d541f4f76aa0e8b37b"

RPROVIDES:${PN} += "libharfbuzz.so.0()(64bit) libharfbuzz0 libharfbuzz0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libfreetype.so.6()(64bit) libglib-2.0.so.0()(64bit) libgraphite2.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
