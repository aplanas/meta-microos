SUMMARY = "Development files of Rime"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the development headers of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime-devel-1.7.3-2.18.aarch64.rpm"
RPM_HASH = "cb29a63194cb7e8bd4b9f31b2bb05421b1a4b0ad143bc34bb39f08a6dcb018c09db5434484eee80b697d8117a725b7a6c793345706806a7010b7d8632362a532"

RPROVIDES:${PN} += "cmake(Rime) librime-devel librime-devel(aarch-64) pkgconfig(rime)"
RDEPENDS:${PN} += "/usr/bin/pkg-config rime"

inherit rpm
