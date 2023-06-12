SUMMARY = "A library for handling UTF-8 encoded strings"
DESCRIPTION = "A C++ library for handling UTF-8 encoded strings."
LICENSE = "BSL-1.0"

PV = "3.2.3"

RPM_NAME = "utfcpp-devel-3.2.3-2.1.aarch64.rpm"
RPM_HASH = "95ba199d13577f5f7aa2e031c4461efa6c419845613da9174f6e9891462c9a5e8baa8448cd0953f6a92971bf0f08cce46c7aaee3230d692301c1f8f131edabb2"

RPROVIDES:${PN} += "cmake(utf8cpp) \
utfcpp-devel \
utfcpp-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
