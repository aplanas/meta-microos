SUMMARY = "Thai word segmentation utility"
DESCRIPTION = "Thai word segmentation utility."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "wordcut-0.5.1b2-205.7.aarch64.rpm"
RPM_HASH = "f730e1b2aebc488cd271dc7e3ad2ef7b98757d69aa161e10fe6fff6b49e9cbc876e8f829e5c6164a5a9118bca1f2e1b9842727f8e0f9dc6ecb4b7d7c212b93da"

RPROVIDES:${PN} += "locale(th) wordcut wordcut(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwordcut.so.0()(64bit)"

inherit rpm
