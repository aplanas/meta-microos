SUMMARY = "Haskell time-manager library development files"
DESCRIPTION = "This package provides the Haskell time-manager library development files."
LICENSE = "MIT"

PV = "0.0.0"

RPM_NAME = "ghc-time-manager-devel-0.0.0-5.2.aarch64.rpm"
RPM_HASH = "99239a522be4a24c357ecd715c75f58462aca4b02ec12aaeea5f12c78b090fe931ae5d702c7afbe1eb91089d6efaec269e2993d6ba935c9060f7052710961232"

RPROVIDES:${PN} += "ghc-devel(time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj) ghc-time-manager-devel ghc-time-manager-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) ghc-devel(base-4.17.1.0) ghc-time-manager"

inherit rpm
