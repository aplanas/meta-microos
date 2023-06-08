SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python310-sip6-devel-6.7.9-1.1.aarch64.rpm"
RPM_HASH = "12625938193e2ef198a705bc7e15be9c2597356ed99a7bd9b5cc65a7a8ac9f233952d20a626896d17d352a26258af5d0462a8440b45d9944b88142f689437470"

RPROVIDES:${PN} += "python3-sip-devel python3-sip-impl python3-sip6-devel python3.10dist(sip) python310-sip-devel python310-sip-impl python310-sip6-devel python310-sip6-devel(aarch-64) python3dist(sip)"
RDEPENDS:${PN} += "(python310-tomli if python310-base < 3.11) /bin/sh /usr/bin/python3.10 c++_compiler ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-devel python310-packaging python310-ply python310-setuptools update-alternatives"

inherit rpm
