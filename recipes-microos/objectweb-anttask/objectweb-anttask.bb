SUMMARY = "ObjectWeb Ant task"
DESCRIPTION = "ObjectWeb Ant task"
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "objectweb-anttask-1.2-264.6.noarch.rpm"
RPM_HASH = "a557045725376ac5805402c934c15495c56c8af2e16beafb3585631714523a450da1a1ff34279a6ef1ff4688d8229f0f50d2b34224564bb78c37c7fea43ce501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objectweb-anttask owanttask"
RDEPENDS:${PN} += ""

inherit rpm
