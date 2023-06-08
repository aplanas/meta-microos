SUMMARY = "Utilities for Amazon S3 service"
DESCRIPTION = "A command-line frontend for Amazon S3 access."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-tools-4.1.git277-1.15.aarch64.rpm"
RPM_HASH = "ca82fbebc3e8c695531a18187556c8b39afc1c21722b16bd8d579b058eabac5729cebb1ad8832cc74ed866e2fab2e1f6170781e937c0831f818fa8f43ee9a62d"

RPROVIDES:${PN} += "libs3-tools libs3-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libs3.so.4()(64bit)"

inherit rpm
