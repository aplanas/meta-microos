SUMMARY = "Representations of semi-open intervals"
DESCRIPTION = "ligo-segments defines the segment, segmentlist, and segmentlistdict objects for \
manipulating semi-open intervals."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python39-ligo-segments-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "8f05451b64b75b9f1c072f5ac0a36ad412f57ff54ee677017f9ecaa963da6a373b6975591ee54cd783027b8ab5333d51f5128d410223afe9b1297dfcf6ce200a"

RPROVIDES:${PN} += "python3.9dist(ligo-segments) python39-ligo-segments python39-ligo-segments(aarch-64) python3dist(ligo-segments)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-six"

inherit rpm
