SUMMARY = "Haskell xml-types library development files"
DESCRIPTION = "This package provides the Haskell xml-types library development files."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-devel-0.3.8-4.2.aarch64.rpm"
RPM_HASH = "adecf3481232ceb95d26c4e1bc27af30a28b3a0eb9beaf5c1506274e3b5aa697a0a4ff303c88b71035b2324aa142e666f9dc4ff2486d6a06045d99b2435c6486"

RPROVIDES:${PN} += "ghc-devel(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb) ghc-xml-types-devel ghc-xml-types-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(text-2.0.2) ghc-xml-types"

inherit rpm
