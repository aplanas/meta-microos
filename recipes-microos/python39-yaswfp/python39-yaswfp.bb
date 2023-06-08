SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python39-yaswfp-0+git.1411687316.2a2cc6c-1.9.noarch.rpm"
RPM_HASH = "51a7338f525854ffa6171fb3360d19110a0724e8117c4464f6c54a82b9b2e14161575c1daa9d5cc2faba640145faad87ab731175379789994f40d45dfe9ce960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yaswfp) python39-yaswfp python3dist(yaswfp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi)"

inherit rpm
