SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python311-intervals-0.9.2-1.5.noarch.rpm"
RPM_HASH = "029af91ea93cca317db0c3182857ce346e2eecc652f4ae9dea9e1ade0731109069f0c1b29a23073e3bf9c567067420d2f6a74183bd7a5ae057a301182ddd1ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(intervals) \
python311-intervals \
python3dist(intervals)"
RDEPENDS:${PN} += "python(abi) \
python311-infinity"

inherit rpm
