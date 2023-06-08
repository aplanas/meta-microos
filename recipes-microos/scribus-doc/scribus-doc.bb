SUMMARY = "Documentation for Scribus"
DESCRIPTION = "This package provides the documentation for Scribus."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-doc-1.5.8-4.10.aarch64.rpm"
RPM_HASH = "92e378132a30838701d95eb1c85336e30529fd6abc8c032e47bf9041aec7a7b4417a2276527a128e6a8767dd9ea0a9c54645c12ba300454dfe8d12e7681c7957"

RPROVIDES:${PN} += "scribus-doc scribus-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
