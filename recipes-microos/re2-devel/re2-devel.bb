SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20230301"

RPM_NAME = "re2-devel-20230301-53.3.aarch64.rpm"
RPM_HASH = "203c4162f987c623016a0244dd794fa400446313302a6ee1e2c28d7dce860e87c92704458786ae7575bf7e0736bc0a60789aebba6048fa78df2e6b88c4bb50b9"

RPROVIDES:${PN} += "cmake(re2) pkgconfig(re2) re2-devel re2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libre2-10 pkgconfig(icu-uc)"

inherit rpm
