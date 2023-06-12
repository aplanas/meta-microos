SUMMARY = "Development files for Guile-SSH"
DESCRIPTION = "The libraries and header files for developing applications that use guile-ssh."
LICENSE = "GPL-3.0-or-later"

PV = "0.16.0"

RPM_NAME = "guile-ssh-devel-0.16.0-1.2.aarch64.rpm"
RPM_HASH = "6423cedde256e29a0ecce522b079f522c73b0bd8a2ea2aaecdf36dbed473f1bc6b548b5f35e15c1ce2e48b21b4f3513bc788b16d2076e709a0dd73bdfea5e9f5"

RPROVIDES:${PN} += "guile-ssh-devel \
guile-ssh-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/guile \
libguile-ssh14"

inherit rpm
