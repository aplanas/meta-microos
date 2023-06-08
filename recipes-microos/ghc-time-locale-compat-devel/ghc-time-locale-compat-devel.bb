SUMMARY = "Haskell time-locale-compat library development files"
DESCRIPTION = "This package provides the Haskell time-locale-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-devel-0.1.1.5-7.2.aarch64.rpm"
RPM_HASH = "a9556220ecae837f277b735de4ee544dc500f52fd65cb87bf3eb1f4480f7e5bbeb1bc0b0fd4cf21f028cbdb5963126b025510b5601a48ee7877001019544e603"

RPROVIDES:${PN} += "ghc-devel(time-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY) ghc-time-locale-compat-devel ghc-time-locale-compat-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(time-1.12.2) ghc-time-locale-compat"

inherit rpm
