SUMMARY = "Common files for the NodeJS ecosystem"
DESCRIPTION = "Common NodeJS files that allow recursive invocation of Node executable \
while retaining the same codestream version."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "nodejs-common-5.1-1.2.aarch64.rpm"
RPM_HASH = "e570ea428b773b31ed3da245f4e6a98fad6771494367bbd221beff0e74f31fa8e4b5a2555130ed2aaa77e28b74befae31b066bac40385abc5a6edc3090397bd3"

RPROVIDES:${PN} += "nodejs-common nodejs-common(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libalternatives.so.1()(64bit) libalternatives.so.1(ALTS_1)(64bit) libc.so.6(GLIBC_2.34)(64bit) nodejs"

inherit rpm
