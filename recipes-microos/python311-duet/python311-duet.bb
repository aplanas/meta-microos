SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.8"

RPM_NAME = "python311-duet-0.2.8-1.1.noarch.rpm"
RPM_HASH = "4eb0633284ce9790c45a6b486c2c1e2816058ceb29c62655e7329cdaf61f09445c6de87592f73307dac0633eef5c343dfd4862c857e842ec4f0562cd12e8401e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(duet) python311-duet python3dist(duet)"
RDEPENDS:${PN} += "python(abi) python311-typing_extensions"

inherit rpm
