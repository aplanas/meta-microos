SUMMARY = "OpenShadingLanguage's image noise generation library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "liboslnoise1_12-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "acb84d50d9e0a796688db37d4b2363796579dfd1c58684958295bb5b9adf14446d3af000dce70c1983ea4026ea604dfe6e7834824b7423d9f1ae6dede88e797b"

RPROVIDES:${PN} += "liboslnoise.so.1.12()(64bit) liboslnoise1_12 liboslnoise1_12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
