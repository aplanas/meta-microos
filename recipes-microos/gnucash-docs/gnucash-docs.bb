SUMMARY = "Documentation Module for GnuCash"
DESCRIPTION = "GnuCash is a personal finance manager. A check-book like register GUI \
allows you to enter and track bank accounts, stocks, income and even \
currency trades. The interface is designed to be simple and easy to \
use, but is backed with double-entry accounting principles to ensure \
balanced books. This is the documentation module for GnuCash."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "gnucash-docs-4.13-9.2.noarch.rpm"
RPM_HASH = "fbef46a166503bb77cbe2b4068777e6d5cea56b801b21d832e48a80e43ff35c176d45158d4d53766aa5d9f1bce253a8a419a4c43b429d8fafa2fcd8a253d8efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnucash-docs"
RDEPENDS:${PN} += ""

inherit rpm
