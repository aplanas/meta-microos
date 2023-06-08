SUMMARY = "Fish completion for skopeo"
DESCRIPTION = "This package contains the fish completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "skopeo-fish-completion-1.11.1-1.3.noarch.rpm"
RPM_HASH = "85aea36bcc0bad20c11bc7da4fe13684a50b45c040307c804231ee98485eeffb78f1b1692ad9c25c8061715c2d699ba7dac10d30c5897f36c5a6e8d97741a503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-fish-completion"
RDEPENDS:${PN} += "fish skopeo"

inherit rpm
