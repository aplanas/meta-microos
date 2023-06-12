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

RPM_NAME = "python39-sip6-devel-6.7.9-2.1.aarch64.rpm"
RPM_HASH = "aff0878f7f98d4287f78d5c61f2d83855a29e672e99003395a348826607c8b128f3677d951fc232ee0650785114d409d74e7bee76d53f5f078ce2df710eb7ee3"

RPROVIDES:${PN} += "python3.9dist(sip) python39-sip-devel python39-sip-impl python39-sip6-devel python39-sip6-devel(aarch-64) python3dist(sip)"
RDEPENDS:${PN} += "(python39-tomli if python39-base < 3.11) /bin/sh /usr/bin/python3.9 c++_compiler ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-devel python39-packaging python39-ply python39-setuptools update-alternatives"

inherit rpm
