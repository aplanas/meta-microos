SUMMARY = "SIP tool to create python bindings -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains common documentation files shared between python2 \
and python3 versions of sip."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python-sip4-doc-4.19.25-6.5.noarch.rpm"
RPM_HASH = "44c21a1f8f6d0256f8609f586ac7580bbf599857ebb7446dd3e2392f5813737a60f6350cdcc4b1f0549d3efcb3959b23f537a02202010dd655d8cb41e82bdab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip4-doc python310-sip4-doc python39-sip4-doc"
RDEPENDS:${PN} += ""

inherit rpm
