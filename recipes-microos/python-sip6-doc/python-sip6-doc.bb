SUMMARY = "A Python bindings generator for C/C++ libraries -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains the documentation and example files."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python-sip6-doc-6.7.9-1.1.aarch64.rpm"
RPM_HASH = "d1ef3839c02757e34925a2dd9ebb21846c66099b3eb1522d5b729db27cce3d738bc25719e489d7e1a40b76f6cd228aaf71ddeb7e3d9c72b9bbcc267058a63904"

RPROVIDES:${PN} += "python-sip6-doc python-sip6-doc(aarch-64) python310-sip6-doc python311-sip6-doc python39-sip6-doc"
RDEPENDS:${PN} += ""

inherit rpm
