SUMMARY = "Examples for python310-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-doc-6.5.0-1.1.noarch.rpm"
RPM_HASH = "ed4c21c509e8fff8b0bbdb8dceb1f232039bb9b24361611ade0346fc528f8203f0fcaa1952d8b27e36726b7fe64a09d119ad51e5086caa21cb7657cce02910ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt6-doc python3-qt6-doc python310-PyQt6-doc python310-qt6-doc"
RDEPENDS:${PN} += ""

inherit rpm
