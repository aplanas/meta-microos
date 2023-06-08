SUMMARY = "A Python bindings generator for C/C++ libraries -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains the documentation and example files in the \
currently default version. Look for python310-sip<N>-devel, \
if you need to build a package with a specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python-sip-doc-6.7.9-4.5.noarch.rpm"
RPM_HASH = "317885e81588c760039d2b40fb69afe81a808c0a53e15bf2e9113adc63c5ba9a59c2e8e9d9863812f9d0c4559adfe6539132f2e9b7e7688b98820d94e03d3210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip-doc python310-sip-doc python311-sip-doc python39-sip-doc"
RDEPENDS:${PN} += ""

inherit rpm
