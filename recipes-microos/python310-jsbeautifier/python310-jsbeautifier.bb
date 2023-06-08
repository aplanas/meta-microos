SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "python310-jsbeautifier-1.14.7-1.4.noarch.rpm"
RPM_HASH = "c4ac539f90966217a13b8f262eeb80a4cdf9491f2cdb59270a49da50f0623c12f0349e7b84e6f0d4fc4dfbac297bbb67bc8be34f73988125e65dcec7a1357355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsbeautifier python3.10dist(jsbeautifier) python310-jsbeautifier python3dist(jsbeautifier)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-EditorConfig python310-setuptools python310-six update-alternatives"

inherit rpm
