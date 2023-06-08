SUMMARY = "The public gpg key for rpm package signature verification"
DESCRIPTION = "GPG key used in staging projects"
LICENSE = "MIT"

PV = "12.0"

RPM_NAME = "staging-build-key-12.0-1.18.noarch.rpm"
RPM_HASH = "edd977ec23da9d205343a5e200149c920a83fac60a1ce08559c859bdb475c688d6e900f4845635c72d156d6d500954548702081950b31ac603c4822a29765c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-key staging-build-key"
RDEPENDS:${PN} += ""

inherit rpm
