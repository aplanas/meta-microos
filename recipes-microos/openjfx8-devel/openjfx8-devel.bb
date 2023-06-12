SUMMARY = "OpenJFX development tools and libraries"
DESCRIPTION = "OpenJFX development tools and libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-devel-8.0.202-8.3.aarch64.rpm"
RPM_HASH = "a2ec48fb999ebb3ec00d485be7156c2aa8bb015288ee15deed7e20dfb31aac9dd9ffcbff042333431b6d04e8e670ad281f52db28d18624c048c98e4c4058df83"

RPROVIDES:${PN} += "java-1_8_0-openjfx-devel \
openjfx8-devel \
openjfx8-devel(aarch-64)"
RDEPENDS:${PN} += "java-devel \
openjfx8"

inherit rpm
