SUMMARY = "The public gpg keys for rpm package signature verification"
DESCRIPTION = "This package contains the gpg keys that are used to sign the \
openSUSE rpm packages. The keys installed here are not actually \
used by anything. rpm/zypper use the keys in the rpm db instead."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "openSUSE-build-key-1.0-47.2.aarch64.rpm"
RPM_HASH = "59cd728f5a1402db1031981ea32d83b9135ddbb7599f956938a034f09f1fb5ff126ac98f16f7e138784349d570654b14b051c090f9d12dfe344fbbce9e3f46d3"

RPROVIDES:${PN} += "build-key openSUSE-build-key openSUSE-build-key(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
