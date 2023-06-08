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

RPM_NAME = "python311-sip6-devel-6.7.9-1.1.aarch64.rpm"
RPM_HASH = "5aa40a3eea15f9ca09b223f00cfa80e3db06184ca38de04bcf7a0ab9af7483d6a4c85994f3fcda1c63be77e0b77298cead2d39724503eceec885f5e8040d2cc1"

RPROVIDES:${PN} += "python3.11dist(sip) python311-sip-devel python311-sip-impl python311-sip6-devel python311-sip6-devel(aarch-64) python3dist(sip)"
RDEPENDS:${PN} += "(python311-tomli if python311-base < 3.11) /bin/sh /usr/bin/python3.11 c++_compiler ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-devel python311-packaging python311-ply python311-setuptools update-alternatives"

inherit rpm
