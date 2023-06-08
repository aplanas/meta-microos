SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "ligo-segments defines the segment, segmentlist, and segmentlistdict objects for \
manipulating semi-open intervals."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python310-ligo-segments-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "28e7d16e0d714239585403a0bcf621e5520c0cc99a7be58ae5a501f71748c54798adbdbb1d2f5062d0291c72aa72f3b85e3b2271f6623b803c766b2f3e3e8676"

RPROVIDES:${PN} += "python3-ligo-segments python3.10dist(ligo-segments) python310-ligo-segments python310-ligo-segments(aarch-64) python3dist(ligo-segments)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-six"

inherit rpm
