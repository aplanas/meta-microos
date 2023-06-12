SUMMARY = "A tool for modernizing Python code using lib2to3"
DESCRIPTION = "A hack on top of fissix for modernizing Python code."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python310-modernize-0.8.0-2.9.noarch.rpm"
RPM_HASH = "943f3caa0e6636db89a45fd2d97131014453f37fe7fc5e357768d723e490eabc78afef5927fe2275e9dd05216d07b990ae29eb6dcac5893e9f909584d9af480b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-modernize \
python3.10dist(modernize) \
python310-modernize \
python3dist(modernize)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-dbm \
python310-fissix \
update-alternatives"

inherit rpm
