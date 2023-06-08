SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python39-python-aiml-0.9.3-3.9.noarch.rpm"
RPM_HASH = "3a7d76cecc35dcf0fb826973b43951b06fee902f94e893f2a5584326de165188ecb1a08bf71dc6c7721b8684a6554ba2f558e03b7dc4f195c7d9a0b7e73dbef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-aiml) python39-aiml python39-python-aiml python3dist(python-aiml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools update-alternatives"

inherit rpm
