SUMMARY = "A Python bindings generator for C/C++ libraries -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains the documentation and example files."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python-sip6-doc-6.7.9-2.1.aarch64.rpm"
RPM_HASH = "5bde1728f81aa7fcf2527c86a2d57b551a6f1af14ebc4bc63fc6dcfe3a075d9bc889d162b5a7a42a6d6989a2bdb70c57151ec6e7c8d4fe583c5b210013439362"

RPROVIDES:${PN} += "python-sip6-doc python-sip6-doc(aarch-64) python310-sip6-doc python311-sip6-doc python39-sip6-doc"
RDEPENDS:${PN} += ""

inherit rpm
