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

RPM_NAME = "python39-sip6-devel-6.7.9-1.1.aarch64.rpm"
RPM_HASH = "b8954511ec063464dcb172508a2d2550985ba049840a7ca2f1c5fb3be0a149a0ab36c5a66b0f6b5d7ecc2a8b0c3dbb2b804401a03f59e960c4ce75c1866e08ea"

RPROVIDES:${PN} += "python3.9dist(sip) python39-sip-devel python39-sip-impl python39-sip6-devel python39-sip6-devel(aarch-64) python3dist(sip)"
RDEPENDS:${PN} += "(python39-tomli if python39-base < 3.11) /bin/sh /usr/bin/python3.9 c++_compiler ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-devel python39-packaging python39-ply python39-setuptools update-alternatives"

inherit rpm
