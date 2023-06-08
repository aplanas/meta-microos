SUMMARY = "Small program answering GTP ECHO Request with GTP ECHO Response"
DESCRIPTION = "Small program answering GTP ECHO Request with GTP ECHO Response for both GTPCv1 \
and GTPCv2."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "gtp-echo-responder-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "dbd2d2410343d560eef94b7ec514b75eed34314490b8ef8533302dd64c02fb396cbf5ee228bee1a6afca02e43c2d3834897c6d53d5f03b40beebc883a28a18f7"

RPROVIDES:${PN} += "gtp-echo-responder gtp-echo-responder(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
