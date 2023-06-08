SUMMARY = "Link-time optimizer for LLVM (devel package)"
DESCRIPTION = "This package contains the link-time optimizer for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-LTO-devel-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "367d8ad2e3683c977be638cd597200d97210850783f9f2b840ae4d132531867a31775e8e40120fc8c05d856539fe18ab6019b743fb8e2cd0641c708f4f209fac"

RPROVIDES:${PN} += "libLTO.so llvm11-LTO-devel llvm11-LTO-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libLTO11 llvm11-devel"

inherit rpm
