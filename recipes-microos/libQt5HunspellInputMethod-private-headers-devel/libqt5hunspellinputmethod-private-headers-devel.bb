SUMMARY = "Non-ABI stable API for libQt5HunspellInputMethod"
DESCRIPTION = "This package provides private headers of libQt5HunspellInputMethod that are \
normally not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5HunspellInputMethod-private-headers-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "23fd6794d0241e5e54109b5c17e84233a5418a6ac6d7c6d6f4dae4975c0cbfa3894649eaa0121c8b8251a193e70789e0caf5a0ed89c35a6167a4d1dc77c5070c"

RPROVIDES:${PN} += "cmake(Qt5HunspellInputMethod) \
libQt5HunspellInputMethod-private-headers-devel \
libQt5HunspellInputMethod-private-headers-devel(aarch-64)"
RDEPENDS:${PN} += "libQt5HunspellInputMethod5 \
libqt5-qtvirtualkeyboard-private-headers-devel"

inherit rpm
