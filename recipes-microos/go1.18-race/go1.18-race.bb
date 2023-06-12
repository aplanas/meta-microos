SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-race-1.18.10-4.1.aarch64.rpm"
RPM_HASH = "b612176c0e20457b11fdd65e5de60df4213cd6f80858fa39800e53e963988f6e140543ea50d0e35f5b20afa5c0d525b10650806054bc3f0ca01d903e66cf2dda"

RPROVIDES:${PN} += "go1.18-race \
go1.18-race(aarch-64)"
RDEPENDS:${PN} += "go1.18"

inherit rpm
