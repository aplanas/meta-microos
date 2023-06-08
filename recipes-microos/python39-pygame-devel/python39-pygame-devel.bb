SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python39-pygame-devel-2.1.3-1.4.aarch64.rpm"
RPM_HASH = "7312b8c6dfd71e70f16543c1ff5ca0f34f8eb699074e7c17682939d5fbe64405425a60df9f2789ba9ba52d210606758a8dee75ce565d1f55f9d868dee1592a02"

RPROVIDES:${PN} += "python39-pygame-devel python39-pygame-devel(aarch-64)"
RDEPENDS:${PN} += "python39-pygame"

inherit rpm
