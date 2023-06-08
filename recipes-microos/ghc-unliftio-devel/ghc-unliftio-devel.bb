SUMMARY = "Haskell unliftio library development files"
DESCRIPTION = "This package provides the Haskell unliftio library development files."
LICENSE = "MIT"

PV = "0.2.24.0"

RPM_NAME = "ghc-unliftio-devel-0.2.24.0-1.3.aarch64.rpm"
RPM_HASH = "e03a7cdab218fc7d5f8ba02effd2a328705c846776516334b37eeab06c3694434c2d5d1608c5f59122be430ed382a38bfe93858344e5ecced14c4a680f20819e"

RPROVIDES:${PN} += "ghc-devel(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) ghc-unliftio-devel ghc-unliftio-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(process-1.6.16.0) ghc-devel(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) ghc-devel(stm-2.5.1.0) ghc-devel(time-1.12.2) ghc-devel(transformers-0.5.6.2) ghc-devel(unix-2.7.3) ghc-devel(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) ghc-unliftio"

inherit rpm
