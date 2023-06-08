SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "python310-soxr-0.3.4-1.2.aarch64.rpm"
RPM_HASH = "a864f9af11a1960c624b465060e8550d424f5bf3e7e69d0c1705cf1396f210176774abc0840b0a54416be680dc6dcd4dc2f93c18c71e90c5eda8f1ea7da9480d"

RPROVIDES:${PN} += "python3-soxr python3.10dist(soxr) python310-soxr python310-soxr(aarch-64) python3dist(soxr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsoxr.so.0()(64bit) python(abi) python310-numpy"

inherit rpm
