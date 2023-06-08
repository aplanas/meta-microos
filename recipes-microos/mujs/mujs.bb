SUMMARY = "An embeddable Javascript interpreter"
DESCRIPTION = "MuJS is a lightweight Javascript interpreter designed for embedding in other software to extend them with scripting capabilities."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "mujs-1.3.2-2.3.aarch64.rpm"
RPM_HASH = "ef8fca023f58ad059481a970c85c3674dd19664cb8dc77ff6a41fe7847d86357f968f8f424a8580d11d5067f0f7af65c33da2ce19b09c2fe173e80e194ad995f"

RPROVIDES:${PN} += "mujs mujs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
