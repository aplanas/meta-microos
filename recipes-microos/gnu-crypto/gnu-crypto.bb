SUMMARY = "GNU Crypto"
DESCRIPTION = "GNU Crypto provides implementations of cryptographic primitives and \
tools in the Java programming language for use by programmers and \
end-users."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "gnu-crypto-2.0.1-260.15.noarch.rpm"
RPM_HASH = "ecf08a2b16d102f98299f1c03ce1f55a47b22507756d040e40643b5784ca39c7f368fbde9acd3d2579461b7aaad4e5085db913d3459866a5bacb3f9e34081c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-crypto jce"
RDEPENDS:${PN} += ""

inherit rpm
