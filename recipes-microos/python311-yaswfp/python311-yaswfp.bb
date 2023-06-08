SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python311-yaswfp-0+git.1411687316.2a2cc6c-1.9.noarch.rpm"
RPM_HASH = "a0a0c37cc4d365344df69258ad2bd8e4171af4f8b6263af7a4ad82e6e2a957ff0c9f196fc729aa58b1a09985f4fceb645169ad040aa510a2c7db4f4cc8b0a0a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yaswfp) python311-yaswfp python3dist(yaswfp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi)"

inherit rpm
