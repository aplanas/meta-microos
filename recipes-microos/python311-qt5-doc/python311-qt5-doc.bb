SUMMARY = "Examples for python311-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-doc-5.15.9-1.6.noarch.rpm"
RPM_HASH = "1a40b3ac0a54d6eedf7be420b8b9c5a78f261ac57a5b43a273dea1aef1b2d531c388add6a25cc826df79c66e2be0ee81e1e768571c4cc938bd8537ab779bf5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-PyQt5-doc \
python311-qt5-doc"
RDEPENDS:${PN} += ""

inherit rpm
