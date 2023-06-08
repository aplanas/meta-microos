SUMMARY = "Haskell xml library development files"
DESCRIPTION = "This package provides the Haskell xml library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-devel-1.3.14-13.3.aarch64.rpm"
RPM_HASH = "cdf5d27343a53aac4d8f05566b9e82d873589793eef7f41a90365a87a18058bac906470e1e6497b8f736b128b517e2cd5906b58ff232aa919c2e6c5396879705"

RPROVIDES:${PN} += "ghc-devel(xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g) ghc-xml-devel ghc-xml-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(text-2.0.2) ghc-xml"

inherit rpm
