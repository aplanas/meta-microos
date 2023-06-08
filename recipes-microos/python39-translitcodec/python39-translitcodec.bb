SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-translitcodec-0.7.0-1.3.noarch.rpm"
RPM_HASH = "f90bc5192c0568a9c3943445d0d26b3f070014b1bf1b7ff742e7adb9e91b15d9a37a4edc21f8b6034cdde49a1b6548485625805bdf40e3ac1cdfe5cf58410cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(translitcodec) python39-translitcodec python3dist(translitcodec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
