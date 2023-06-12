SUMMARY = "Contrib scripts for Neomutt"
DESCRIPTION = "Examples, scripts and helpers that are distributed with Neomutt but are not \
maintained by the Neomutt authors."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-contrib-20230517-1.1.noarch.rpm"
RPM_HASH = "d2eacb6002b68cea040f36d31f711441b953164858018ec9d9990d07d717efbfff0a645e0f183069ece7545a6047fa16d4d46f151923ae2167224ac3144f9f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-contrib"
RDEPENDS:${PN} += "/usr/bin/env neomutt"

inherit rpm
