SUMMARY = "Link-time optimizer for LLVM (devel package)"
DESCRIPTION = "This package contains the link-time optimizer for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-LTO-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "dc60f1a37eaf74956df1510fa78e3019ec257888dbe260a2cfa1c21fb6321c40e41719a57083ca0aced74c569649ba71aa42f9915f7df5e891ea857769fead5a"

RPROVIDES:${PN} += "libLTO.so \
llvm11-LTO-devel \
llvm11-LTO-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libLTO11 \
llvm11-devel"

inherit rpm
