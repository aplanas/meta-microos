SUMMARY = "Manual for PSPP"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-doc-1.4.1-3.12.aarch64.rpm"
RPM_HASH = "f6464af62a2d8bd62aa27ae5043522a5e8f707360cf56d344d9d355af7a63a9da6d59f7685b571e922af616a3a02a6edcc646115e2e21788666e9fcb6d4851c1"

RPROVIDES:${PN} += "pspp-doc \
pspp-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
