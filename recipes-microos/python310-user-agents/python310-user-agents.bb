SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-user-agents-2.1.0-1.13.noarch.rpm"
RPM_HASH = "ccca7a142b15cd798c4da370d595099e66d6dbd3eb4fedb5a0bf5e7cd95dd8356f614ba5f8b4aa9f31af6124062d370dc3d3913edba4441c39c459ce3573879a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agents \
python3.10dist(user-agents) \
python310-user-agents \
python3dist(user-agents)"
RDEPENDS:${PN} += "python(abi) \
python310-PyYAML \
python310-ua-parser"

inherit rpm
