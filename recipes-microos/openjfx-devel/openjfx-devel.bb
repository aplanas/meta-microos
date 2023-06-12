SUMMARY = "OpenJFX development tools and libraries"
DESCRIPTION = "OpenJFX development tools and libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "17.0.7.0"

RPM_NAME = "openjfx-devel-17.0.7.0-1.1.aarch64.rpm"
RPM_HASH = "494ec9c3a852b1432901d7375c9cd504d47969d3a5beb50e9f3a6e18ef7ac324bdf286d2079e573431cab1b071301c6cee2bcea5800ea8e454c96485270a42ee"

RPROVIDES:${PN} += "openjfx-devel openjfx-devel(aarch-64)"
RDEPENDS:${PN} += "openjfx"

inherit rpm
