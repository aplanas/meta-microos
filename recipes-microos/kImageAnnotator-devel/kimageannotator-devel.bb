SUMMARY = "Development files for kImageAnnotator"
DESCRIPTION = "Development files for kImageAnnotator including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "kImageAnnotator-devel-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "de5cbff76ce2af24e32a7eedb20a48002b7681e1dade536a810073084bd30e66880b5174871eed9c0228a9afa1e19c73d17b73aec67aac7ce26cdfbeec355bce"

RPROVIDES:${PN} += "cmake(kImageAnnotator) \
kImageAnnotator-devel \
kImageAnnotator-devel(aarch-64)"
RDEPENDS:${PN} += "libkImageAnnotator0"

inherit rpm
