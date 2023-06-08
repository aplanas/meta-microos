SUMMARY = "Development files for kseexpr"
DESCRIPTION = "Development headers and libraries for kseexpr."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "kseexpr-devel-4.0.4.0-1.10.aarch64.rpm"
RPM_HASH = "b0bc2b0a85857bc57d51322f484d3d8d34851e92330795775c789334625da6454ffe74cd6f942a87377bd77451feacce3b9007432f3d80e6a8f01152cfad8489"

RPROVIDES:${PN} += "cmake(kseexpr) kseexpr-devel kseexpr-devel(aarch-64) pkgconfig(kseexpr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libKSeExpr4"

inherit rpm
