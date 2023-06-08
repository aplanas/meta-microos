SUMMARY = "Support library for utilities from the Schily toolbox"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily2_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "52cfdf58892b291601c6811bd2e0200247e2ee899329073eff738b6f0d75f86797ed08c67d5594cc5f8e8e6e4d223b9f7e71ec8c72996c014c4dd54644ff6532"

RPROVIDES:${PN} += "libschily.so.2.0()(64bit) libschily.so.2.0(SCHILY_1.0)(64bit) libschily.so.2.0(SCHILY_1.1)(64bit) libschily.so.2.0(SCHILY_1.10)(64bit) libschily.so.2.0(SCHILY_1.2)(64bit) libschily.so.2.0(SCHILY_1.3)(64bit) libschily.so.2.0(SCHILY_1.4)(64bit) libschily.so.2.0(SCHILY_1.5)(64bit) libschily.so.2.0(SCHILY_1.6)(64bit) libschily.so.2.0(SCHILY_1.7)(64bit) libschily.so.2.0(SCHILY_1.8)(64bit) libschily.so.2.0(SCHILY_1.9)(64bit) libschily.so.2.0(SCHILY_2.0)(64bit) libschily2_0 libschily2_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
