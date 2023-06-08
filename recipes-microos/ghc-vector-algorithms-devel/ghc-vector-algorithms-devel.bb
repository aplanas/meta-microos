SUMMARY = "Haskell vector-algorithms library development files"
DESCRIPTION = "This package provides the Haskell vector-algorithms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-devel-0.9.0.1-1.3.aarch64.rpm"
RPM_HASH = "8c6a3f4a4de8d92c047c5115a9ea4b39d03404c736a3362c1c9a9fc8b0f2f372bdcb71ff86a7051cc0ccbc40a3e10702c8ab04085ae86f41a667efd3caa04bd5"

RPROVIDES:${PN} += "ghc-devel(vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6) ghc-vector-algorithms-devel ghc-vector-algorithms-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy) ghc-devel(bytestring-0.11.4.0) ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-vector-algorithms"

inherit rpm
