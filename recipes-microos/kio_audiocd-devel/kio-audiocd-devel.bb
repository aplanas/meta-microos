SUMMARY = "Development package for kio_audiocd"
DESCRIPTION = "This package contains the development files for the audiocd kio slave"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kio_audiocd-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2717738f2647b39420f25d8f035472617f094d2890116858419762a2d3114d3449c60328bda41f8154a44cabbd71d61d2e3184e56dac16ac90a94c709e1a5df5"

RPROVIDES:${PN} += "kio_audiocd-devel kio_audiocd-devel(aarch-64)"
RDEPENDS:${PN} += "kio_audiocd"

inherit rpm
