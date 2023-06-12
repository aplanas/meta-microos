SUMMARY = "Common files for the NodeJS ecosystem"
DESCRIPTION = "Common NodeJS files that allow recursive invocation of Node executable \
while retaining the same codestream version."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "nodejs-common-5.1-2.1.aarch64.rpm"
RPM_HASH = "3c6819a767fb7cfddba92ad882c43dffeb637af4d304d64f66a9ceec9f8bb0e9e317d0ea969882887bf0f86479c1b08a8b407db46d66023b264732ea30a6e762"

RPROVIDES:${PN} += "nodejs-common \
nodejs-common(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libalternatives.so.1()(64bit) \
libalternatives.so.1(ALTS_1)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
nodejs"

inherit rpm
