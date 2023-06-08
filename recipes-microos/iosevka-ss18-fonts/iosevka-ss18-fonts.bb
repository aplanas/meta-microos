SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss18-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "5a53b3cb1d6817ad682211968000cb3185d867653c5e9d6dfb0983661e6662fc487062dd06ec2c521c56d82429bbee48555b65be1472c420f3f10c903792e6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
