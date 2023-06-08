SUMMARY = "Development package for building linux key management utilities"
DESCRIPTION = "This package provides headers and libraries for building key utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "keyutils-devel-1.6.3-6.1.aarch64.rpm"
RPM_HASH = "f1e46993a1576f5524be1d8cb80af4d603b684349a0e38c581e8c09d043ca32fee9fb1bb101fe96fa42c2668f15a65a937fa1f93bf2d68bd8d5117d19201966c"

RPROVIDES:${PN} += "keyutils-devel keyutils-devel(aarch-64) pkgconfig(libkeyutils)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libkeyutils1"

inherit rpm
