SUMMARY = "Haskell vector-binary-instances library development files"
DESCRIPTION = "This package provides the Haskell vector-binary-instances library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-devel-0.2.5.2-5.2.aarch64.rpm"
RPM_HASH = "9bb524c5b7015046f98545d59a06c8a223d124445b6a99654bf471ce060def59a9e6ddf228e88c4942540962dbda5dd9bf596610b91ffcbf93638e9b996efdfe"

RPROVIDES:${PN} += "ghc-devel(vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8) \
ghc-vector-binary-instances-devel \
ghc-vector-binary-instances-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-vector-binary-instances"

inherit rpm
