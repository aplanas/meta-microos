SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python311-cachelib-0.10.2-2.1.noarch.rpm"
RPM_HASH = "c0b1f597d61eceefb1c37d8506a3762c5b695cfb24ef49d80a329adb74875050ac09f461cab38b2391d627c1ea95f2ad22f9f8abca76ea7193cba5e4399dc125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachelib) \
python311-cachelib \
python3dist(cachelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
