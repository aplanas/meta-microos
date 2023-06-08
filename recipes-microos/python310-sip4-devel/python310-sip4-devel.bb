SUMMARY = "SIP tool to create python bindings"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python310-sip4-devel-4.19.25-6.5.aarch64.rpm"
RPM_HASH = "d56be4e19388cb595daa0cd64550c6461f9a9068309fbb7989172a7cbb525606054f971bc2a6b4cd69ff14523d120eaf0c8943cca15a08c2a909a3fed258e95a"

RPROVIDES:${PN} += "python3-sip-bin python3-sip-devel python3-sip4-devel python310-sip-bin python310-sip-devel python310-sip4-devel python310-sip4-devel(aarch-64) rpm_macro(requires_python310_sip_api)"
RDEPENDS:${PN} += "/bin/sh c++_compiler ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi) python310-devel python310-sip4 python310-sip4-common update-alternatives"

inherit rpm
