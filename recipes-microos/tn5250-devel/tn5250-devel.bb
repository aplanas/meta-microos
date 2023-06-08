SUMMARY = "Header files for the 5250 Emulator"
DESCRIPTION = "Header files for use with the tn5250 library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "tn5250-devel-0.16.5-469.6.aarch64.rpm"
RPM_HASH = "b9a87e020f1189c440606f5332ee6ff2f71f8831cc37d17ac36e35072f18bb955cb9f406aef91a7053a7015e722d1c07d74a6922c8693a19cec970c5b61a349d"

RPROVIDES:${PN} += "tn5250-devel tn5250-devel(aarch-64) tn5250:/usr/include/tn5250/tn5250d.h"
RDEPENDS:${PN} += "lib5250-0"

inherit rpm
