SUMMARY = "Compiler for Genshi syntax outputting Python bytecode"
DESCRIPTION = "Kajiki compiles Genshi-like syntax to Python bytecode. \
 \
(Genshi is a Python library parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web.)"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-Kajiki-0.9.2-1.2.aarch64.rpm"
RPM_HASH = "2c34c1e7b440814cd5f10e1de407cd1ed832bb9444ba524ad0beb96b84f0f25869931bf1b4e2904ef7eb8de44fcc25e9638c9d985452f0b79ce7245d359452d0"

RPROVIDES:${PN} += "python3.11dist(kajiki) \
python311-Kajiki \
python311-Kajiki(aarch-64) \
python3dist(kajiki)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-linetable \
python311-nine \
update-alternatives"

inherit rpm
