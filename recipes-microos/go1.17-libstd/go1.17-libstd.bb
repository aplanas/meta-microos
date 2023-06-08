SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-libstd-1.17.13-5.1.aarch64.rpm"
RPM_HASH = "215a7f7a376787ffb13ab0912bb1689bb188fd83b70bdca1d5711b81677c8a0cd5fdd3140f8ff53387330621a69ffec1112d0357f8a0f74263e75b2d276d167f"

RPROVIDES:${PN} += "go-libstd go1.17-libstd go1.17-libstd(aarch-64) libstd.so()(64bit)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
