SUMMARY = "The public gpg key for rpm package signature verification"
DESCRIPTION = "This package contains the gpg keys that are used to sign the \
SUSE rpm packages. The keys installed here are not actually \
used by anything. rpm/zypper use the keys in the rpm db instead."
LICENSE = "GPL-2.0-or-later"

PV = "12.0"

RPM_NAME = "suse-build-key-12.0-10.6.noarch.rpm"
RPM_HASH = "4ca9ef74e6efda6577517f5c180a105fdeff052cf9b4f52155db7c2f527a1353edc85037065d40ae47f8e39f672170972783b2a8ad6fad177c2e5601b29d05b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-key suse-build-key"
RDEPENDS:${PN} += "fileutils gpg mktemp sh-utils"

inherit rpm
