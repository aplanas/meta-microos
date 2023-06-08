SUMMARY = "GSM utilities from the osmocore project"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
This package contains a program for frequency calculation for GSM \
called 'osmo-arfcn', and a program called 'osmo-auc-gen' that is used \
for testing GSM authentication."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only & GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocore-tools-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "5d9325d76c86b41d82b117be4044913c1b5577ba99b02d37837e26243a4ed4fc783df8419f07077c2abffa379dad31d8c49789f877fabf1cead4a866be18d0d0"

RPROVIDES:${PN} += "libosmocore-tools libosmocore-tools(aarch-64) libosmocore-utils"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
