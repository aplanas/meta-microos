SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss12-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "3af74ce34829caa64c4def782f8542ab8facd63b2e6a4a88ba7fbb96e1c447c9ec5b5347b373a57cc1063b437630db1e95509a3556de65a6d7afc19743af17f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
